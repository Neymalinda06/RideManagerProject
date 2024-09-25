public class Visitor extends Person {
    private String visitorId;
    private String ticketType;
    private String notes;

    public Visitor() {
        this.setName(null);
        this.setAge(0);
        this.setGender(null);
        this.setVisitorId(null);
        this.setTicketType(null);
        this.setNotes(null);
    }

    public Visitor(String name, int age, String gender, String visitorId, String ticketType, String n) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        this.setVisitorId(visitorId);
        this.setTicketType(ticketType);
        this.setNotes(n);
    }

    public Visitor(String name, int age, String gender, String visitorId, String ticketType) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        this.setVisitorId(visitorId);
        this.setTicketType(ticketType);
        this.setNotes(null);
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

    public String getNotes()
    {
        return notes;
    }

    public void setNotes(String notes)
    {
        this.notes = notes;
    }

   
    @Override
    public String Details() {
        return "Visitor, name: " + getName() + ", age: " + getAge() + ", gender: " + getGender() + ", NOTES :" + getNotes();
    }

}
