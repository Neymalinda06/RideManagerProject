public class Employee extends Person {
    private String employeeId;
    private String position;

    public Employee() {
        this.setName(null);
        this.setAge(0);
        this.setGender(null);
        this.setEmployeeId(null);
        this.setPosition(null);
    }

    public Employee(String name, int age, String gender, String employeeId, String position) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        this.setEmployeeId(employeeId);
        this.setPosition(position);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    @Override
    public String Details() {
        return "Employee, name: " + getName() + ", age: " + getAge() + ", gender: " + getGender() + ", employee id: " + getEmployeeId() + ", position: " + getPosition();
    }
}
