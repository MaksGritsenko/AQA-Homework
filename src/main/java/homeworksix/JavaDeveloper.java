package homeworksix;

public class JavaDeveloper extends Employee {

    protected JavaDeveloper(String name) {
        super(name);
    }

    @Override
    public String getPosition() {
        return "Java Developer";
    }

    @Override
    public String getSeniority() {
        return "Senior";
    }
}
