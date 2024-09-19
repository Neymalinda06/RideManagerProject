public class Visitor extends Person {
    private String visitorId;
    private String ticketType;

    public Visitor() {
        this.setName(null);
        this.setAge(0);
        this.setGender(null);
        this.setVisitorId(null);
        this.setTicketType(null);
    }

    public Visitor(String name, int age, String gender, String visitorId, String ticketType) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        this.setVisitorId(visitorId);
        this.setTicketType(ticketType);
    }

    public String getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }
    @Override
    public String Details() {
        return "Visitor, name: " + getName() + ", age: " + getAge() + ", gender: " + getGender() + ", id: " + getVisitorId() + ", ticket type: " + getTicketType();
    }

}
