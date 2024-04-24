package homeworksix;

public class AngularDeveloper extends Employee {

    protected AngularDeveloper(String name) {
        super(name);
    }

    @Override
    public String getPosition() {
        return "Angular Developer";
    }

    @Override
    public String getSeniority() {
        return "Middle";
    }
}
