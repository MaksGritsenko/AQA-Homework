package homeworkseven;

public class Human extends Member {

    protected Human(int maxRunningDistance, int maxClampingHeight) {
        super(maxRunningDistance, maxClampingHeight);
    }

    @Override
    public void run(boolean isSuccess, int distance) {
        if (isSuccess) {
            System.out.println("The human run racetrack on distance " + distance);
        } else
            System.out.println("The human not run racetrack on distance " + distance + " Passed is: " + this.getMaxRunningDistance());
    }

    @Override
    public void jump(boolean isSuccess, int distance) {
        if (isSuccess) {
            System.out.println("The human jump wall on distance " + distance);
        } else
            System.out.println("The human not jump wall on distance " + distance + " Passed is: " + this.getMaxClampingHeight());
    }
}