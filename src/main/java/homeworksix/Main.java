package homeworksix;

public class Main {
    public static void main(String[] args) {

        AngularDeveloper angularDeveloper = new AngularDeveloper("Bill");
        AutomationEngineer automationEngineer = new AutomationEngineer("Misha", "Aksani");
        ManualTestEngineer manualTestEngineer = new ManualTestEngineer("John", "Smith");
        JavaDeveloper javaDeveloper = new JavaDeveloper("Tom");
        Manager manager = new Manager("William", "Underwood");
        manager.setTeamMembers(javaDeveloper, angularDeveloper, automationEngineer, manualTestEngineer);
        javaDeveloper.getInfo();
        angularDeveloper.getInfo();
        automationEngineer.getInfo();
        manualTestEngineer.getInfo();
        manager.getInfo();
    }
}
