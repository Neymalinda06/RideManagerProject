import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Collections;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ride implements RideInterface {
    private String rideName;
    private int minAge;
    private Employee operator;
    private Queue<Visitor> visitorQueue;
    private LinkedList<Visitor> rideHistory;
    private int maxRider;
    private int numOfCycle;
    // Create a ReentrantLock instance
    private final Lock lock = new ReentrantLock();

    public Ride(){
        this.setRideName(null);
        this.setMinAge(0);
        this.setOperator(null);
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.numOfCycle = 0;
    }



    public Ride(String rideName, int minAge, Employee operator, int maxRider){
        this.setRideName(rideName);
        this.setMinAge(minAge);
        this.setOperator(operator);
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.maxRider = maxRider;
        this.numOfCycle = 0;

    }


    public String Details() {
        return "Rider, rider name: " + getRideName() + ", min age: " + getMinAge() + ", operator: " + getOperator();
    }

    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    public void assignOperator(Employee operator) {
        this.operator = operator;
    }

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        lock.lock();
        try{
            if (visitor.getAge() >= minAge) {
                visitorQueue.add(visitor);
                System.out.println("Visitor " + visitor.getName() + " has been added to the queue.");
            } else {
                System.out.println("Visitor " + visitor.getName() + " is too young for the ride.");
            }
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        lock.lock();
        try {
            if (visitorQueue.remove(visitor)) {
                System.out.println("Visitor " + visitor.getName() + " has been removed from the queue.");
            } else {
                System.out.println("Visitor " + visitor.getName() + " is not in the queue.");
            }
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void printQueue() {
        System.out.println("Visitors in the queue for " + rideName + ":");
        lock.lock();
        try {
            for (Visitor visitor : visitorQueue) {
                System.out.println(visitor.Details());
            }
        }finally {
            lock.unlock();
        }
    }

    @Override
    public void runOneCycle() {
        if (!visitorQueue.isEmpty()) {
            Visitor visitor = visitorQueue.poll();
//            String historyEntry = "Visitor " + visitor.getName() + " enjoyed the ride " + rideName;
            rideHistory.add(visitor);
            System.out.println("Running one cycle with visitor: " + visitor.getName());
        }
        else if (operator == null) {
            System.out.println("No operator assigned to run the ride.");
        }
        else {
            System.out.println("No visitors in the queue for the ride.");
        }

        int riders = Math.min(maxRider, visitorQueue.size());
        lock.lock();
        try {
            for (int i = 0; i < riders; i++){
                Visitor visitor = visitorQueue.poll();
                rideHistory.add(visitor);
                System.out.println(visitor.getName() + " is taking the ride. ");
            }
            numOfCycle++;
        } finally {
            lock.unlock();
        }
        System.out.println("Ride has been run " + numOfCycle + "times");
    }

    @Override
    public void printRideHistory() {
        System.out.println("Ride history for " + rideName + ":");
        lock.lock();
        try {
            for (Visitor visitor : rideHistory) {
                System.out.println(visitor.getName());
            }
        } finally {
            lock.unlock();
        }
    }
    public void addVisitorToRideHistory(Visitor visitor) {
        lock.lock();
        try {
            rideHistory.add(visitor);
            System.out.println(visitor.getName() + " added to the ride history.");
        } finally {
            lock.unlock();
        }
    }

    public boolean isVisitorInRideHistory(Visitor visitor) {
        lock.lock();
        try {
            boolean found = rideHistory.contains(visitor);
            System.out.println(visitor.getName() + (found ? " is" : " is not") + " in the ride history.");
            return found;
        }finally {
            lock.unlock();
        }
    }

    public int getNumberOfVisitorsInRideHistory() {
        lock.lock();
        try {
            int count = rideHistory.size();
            System.out.println("Number of visitors in ride history: " + count);
            return count;
        }finally {
            lock.unlock();
        }
    }

    public void sortRideHistory() {
        lock.lock();
        try {
            Collections.sort(rideHistory, new VisitorComparator());
            System.out.println("Ride history sorted.");
        } finally {
            lock.unlock();
        }
    }

    public void writeRideHistoryToFile(String filename) {
        lock.lock();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Visitor visitor : rideHistory) {
                writer.write(visitor.getName() + "," + visitor.getAge() + "," + visitor.getGender() + "," + visitor.getVisitorId() + "," + visitor.getTicketType());
                writer.newLine();
            }
            System.out.println("Ride history successfully written to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } finally {
            lock.unlock();
        }
    }

    public void readRideHistoryFromFile(String filename) {
        lock.lock();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] details = line.split(",");
                if (details.length == 5) {
                    String name = details[0];
                    int age = Integer.parseInt(details[1]);
                    String gender = details[2];
                    String visitorId = details[3];
                    String visitorType = details[4];
                    Visitor visitor = new Visitor(name, age, gender, visitorId, visitorType);
                    rideHistory.add(visitor);
                }
            }
            System.out.println("Ride history successfully read from " + filename);
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing visitor details: " + e.getMessage());
        }finally {
            lock.unlock();
        }
    }
}
