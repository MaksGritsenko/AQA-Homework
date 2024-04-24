package homeworksix;

import java.util.Arrays;

public class Manager extends Employee {

    final String lastName;
    private Employee[] team;

    protected Manager(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    public void setTeamMembers(Employee... members) {
        this.team = new Employee[members.length];
        for (int i = 0; i < members.length; i++) {
            team[i] = members[i];
        }
    }

    @Override
    public String getPosition() {
        return "Manager";
    }

    @Override
    public String getSeniority() {
        return "Senior";
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void getInfo() {
        String nameUsers[] = new String[team.length];
        for (int i = 0; i < team.length; i++) {
            nameUsers[i] = team[i].getName();
        }
        System.out.println(getName()
                + " "
                + getLastName()
                + "is a "
                + getSeniority()
                + " "
                + getPosition()
                + " and has a team of "
                + team.length
                + " "
                + "members:"
                + Arrays.toString(nameUsers));
    }
}
