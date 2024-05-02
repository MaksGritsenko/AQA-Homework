package homeworkseven;

public class Racetrack implements Barrier {

    private int length;

    protected Racetrack(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Member member) {
        if (member.getMaxRunningDistance() > length) {
            member.run(true, length);
            return true;
        } else {
            member.run(false, length);
            return false;
        }
    }
}
