package homeworksix;

public abstract class Employee {

    private String name;

    protected Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return "";
    }

    public abstract String getPosition();

    public abstract String getSeniority();

    public void getInfo() {
        System.out.println(getName() + " " + getLastName() + " is a " + getSeniority() + " " + getPosition());
    }
}
