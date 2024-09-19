public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
        assignment.partFourA();
        assignment.partFourB();
        assignment.partFive();
        assignment.partSix();
        assignment.partSeven();

    }
    public void partThree() {
        // Implementation for part three
        // Create a new Ride object
        Employee operator = new Employee("Mahala", 24, "Male", "E001", "Operator");
        Ride rollerCoaster = new Ride("Roller Coaster", 12, operator, 1);

        // Create Visitor objects
        Visitor visitor1 = new Visitor("Suzan", 14, "Female", "V001", "Regular");
        Visitor visitor2 = new Visitor("Sadaru", 16, "Male", "V002", "Regular");
        Visitor visitor3 = new Visitor("Prabu", 15, "Male", "V003", "Regular");
        Visitor visitor4 = new Visitor("Renuka", 13, "Female", "V004", "Regular");
        Visitor visitor5 = new Visitor("Gian", 17, "Male", "V005", "Regular");

        System.out.println("----------------------------------");
        System.out.println("----Add visitors to the queue----");
        // Add visitors to the queue
        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);

        System.out.println("----Remove a visitor from the queue----");
        // Remove a visitor from the queue
        rollerCoaster.removeVisitorFromQueue(visitor3);

        System.out.println("----Print all visitors in the queue----");
        // Print all visitors in the queue
        rollerCoaster.printQueue();
    }

    public void partFourA() {
        // Implementation for part four A
        // Create a new Ride object
        Employee operator = new Employee("Sham", 35, "Female", "E002", "Operator");
        Ride thunderstorm = new Ride("Thunderstorm", 10, operator, 2);

        // Create Visitor objects
        Visitor visitor1 = new Visitor("Tomy", 12, "Male", "V006", "Regular");
        Visitor visitor2 = new Visitor("Sherry", 14, "Female", "V007", "Regular");
        Visitor visitor3 = new Visitor("Ken", 13, "Male", "V008", "Regular");
        Visitor visitor4 = new Visitor("Danial", 15, "Male", "V009", "Regular");
        Visitor visitor5 = new Visitor("Anni", 16, "Female", "V010", "Regular");

        System.out.println("----------------------------------");
        System.out.println("----Add visitors to the ride history(collection)----");
        // Add visitors to the collection
        thunderstorm.addVisitorToRideHistory(visitor1);
        thunderstorm.addVisitorToRideHistory(visitor2);
        thunderstorm.addVisitorToRideHistory(visitor3);
        thunderstorm.addVisitorToRideHistory(visitor4);
        thunderstorm.addVisitorToRideHistory(visitor5);

        System.out.println("----Check if a visitor(visitor 3) is in the rider history(collection)----");
        // Check if a visitor is in the collection
        thunderstorm.isVisitorInRideHistory(visitor3);

        System.out.println("----Print the number of visitors in the rider history(collection)----");
        // Print the number of visitors in the collection
        thunderstorm.getNumberOfVisitorsInRideHistory();

        System.out.println("----Print all visitors in the ride history(collection) for Thunderstorm----");
        // Print all visitors in the collection
        thunderstorm.printRideHistory();
    }

    public void partFourB() {
        // Implementation for part four B
        // Create a new Ride object
        Employee operator = new Employee("Lisa", 40, "Female", "E003", "Operator");
        Ride ferrisWheel = new Ride("Ferris Wheel", 8, operator, 2);

        // Create Visitor objects
        Visitor visitor1 = new Visitor("Kim", 12, "Male", "V011", "Regular");
        Visitor visitor2 = new Visitor("Saf", 14, "Male", "V012", "Regular");
        Visitor visitor3 = new Visitor("Rose", 13, "Female", "V013", "Regular");
        Visitor visitor4 = new Visitor("Jemmie", 15, "Female", "V014", "Regular");
        Visitor visitor5 = new Visitor("Branch", 11, "Male", "V015", "Regular");

        System.out.println("----------------------------------");
        System.out.println("----Add visitors to the ride history(collection) for Ferris Wheel----");
        // Add visitors to the collection
        ferrisWheel.addVisitorToRideHistory(visitor1);
        ferrisWheel.addVisitorToRideHistory(visitor2);
        ferrisWheel.addVisitorToRideHistory(visitor3);
        ferrisWheel.addVisitorToRideHistory(visitor4);
        ferrisWheel.addVisitorToRideHistory(visitor5);

        System.out.println("----Print all visitors in the ride history for Ferris Wheel----");
        // Print all visitors in the collection
        System.out.println("Before sorting:");
        ferrisWheel.printRideHistory();

        // Sort the collection
        ferrisWheel.sortRideHistory();

        System.out.println("----Print all visitors in the ride history(collection) has been sorted according to their age ----");
        // Print all visitors in the collection again to show that the collection has been sorted
        System.out.println("After sorting:");
        ferrisWheel.printRideHistory();
    }

    public void partFive() {
        // Implementation for part five
        // Create a new Ride object
        Employee operator = new Employee("Randi", 27, "Male", "E004", "Operator");
        Ride taipan = new Ride("Taipan", 12, operator, 3);

        // Create Visitor objects
        Visitor visitor1 = new Visitor("May", 14, "Female", "V016", "Regular");
        Visitor visitor2 = new Visitor("Ran", 16, "Male", "V017", "Regular");
        Visitor visitor3 = new Visitor("Jerry", 15, "Male", "V018", "Regular");
        Visitor visitor4 = new Visitor("Jan", 13, "Female", "V019", "Regular");
        Visitor visitor5 = new Visitor("Nicki", 17, "Female", "V020", "Regular");
        Visitor visitor6 = new Visitor("Kim", 12, "Male", "V021", "Regular");
        Visitor visitor7 = new Visitor("Mel", 16, "Female", "V022", "Regular");
        Visitor visitor8 = new Visitor("Sam", 15, "Male", "V023", "Regular");
        Visitor visitor9 = new Visitor("Abby", 14, "Female", "V024", "Regular");
        Visitor visitor10 = new Visitor("Sammy", 18, "Male", "V025", "Regular");

        System.out.println("----------------------------------");
        System.out.println("----Add visitors to the queue for Taipan Ride----");
        // Add visitors to the queue
        taipan.addVisitorToQueue(visitor1);
        taipan.addVisitorToQueue(visitor2);
        taipan.addVisitorToQueue(visitor3);
        taipan.addVisitorToQueue(visitor4);
        taipan.addVisitorToQueue(visitor5);
        taipan.addVisitorToQueue(visitor6);
        taipan.addVisitorToQueue(visitor7);
        taipan.addVisitorToQueue(visitor8);
        taipan.addVisitorToQueue(visitor9);
        taipan.addVisitorToQueue(visitor10);

        System.out.println("----Print all visitors in the queue for Taipan Ride----");
        // Print all visitors in the queue
        taipan.printQueue();

        System.out.println("----Print who took the ride----");
        // Run one cycle
        taipan.runOneCycle();

        System.out.println("----Print all visitors in the queue after one cycle is run----");
        // Print all visitors in the queue after one cycle is run
        taipan.printQueue();

        System.out.println("----Print all visitors in the rider history(collection) for Taipan----");
        // Print all visitors in the collection
        taipan.printRideHistory();
    }

    public void partSix() {
        // Implementation for part six
        // Create a new Ride object
        Employee operator = new Employee("Richard", 30, "Male", "E005", "Operator");
        Ride twinDragon = new Ride("Twin Dragon", 12, operator, 2);

        // Create Visitor objects
        Visitor visitor1 = new Visitor("Alice", 15, "Female", "V026", "Regular");
        Visitor visitor2 = new Visitor("Toby", 16, "Male", "V027", "Regular");
        Visitor visitor3 = new Visitor("Willy", 17, "Male", "V028", "Regular");
        Visitor visitor4 = new Visitor("Lila", 16, "Female", "V029", "Regular");
        Visitor visitor5 = new Visitor("Nora", 15, "Female", "V030", "Regular");

        System.out.println("----------------------------------");
        System.out.println("----Add visitors to the ride history for Twin Dragon ride----");
        // Add visitors to the ride history
        twinDragon.addVisitorToRideHistory(visitor1);
        twinDragon.addVisitorToRideHistory(visitor2);
        twinDragon.addVisitorToRideHistory(visitor3);
        twinDragon.addVisitorToRideHistory(visitor4);
        twinDragon.addVisitorToRideHistory(visitor5);

        System.out.println("----------------------------------");
        // Export the Visitor history to a file
        twinDragon.writeRideHistoryToFile("rideHistory.txt");
    }

    public void partSeven() {
        // Implementation for part seven
        // Create a new Ride object
        Ride twinDragon = new Ride();

        System.out.println("----------------------------------");
        // Import the file created in the previous part of the assignment
        twinDragon.readRideHistoryFromFile("rideHistory.txt");

        // Print the number of Visitors in the LinkedList to confirm the correct number of Visitors were imported
        int numberOfVisitors = twinDragon.getNumberOfVisitorsInRideHistory();
        System.out.println("Number of visitors in the ride history: " + numberOfVisitors);

        System.out.println("----------------------------------");
        // Print all Visitors in the LinkedList to confirm the details of each Visitor were imported correctly
        twinDragon.printRideHistory();

    }
}
