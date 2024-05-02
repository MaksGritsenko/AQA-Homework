package homeworkseven;

public class Robot extends Member {

    protected Robot(int maxRunningDistance, int maxClampingHeight) {
        super(maxRunningDistance, maxClampingHeight);
    }

    @Override
    public void run(boolean isSuccess, int distance) {
        if (isSuccess) {
            System.out.println("The robot run racetrack on distance " + distance);
        } else
            System.out.println("The robot not run racetrack on distance " + distance + " Passed is: " + this.getMaxRunningDistance());
    }

    @Override
    public void jump(boolean isSuccess, int distance) {
        if (isSuccess) {
            System.out.println("The robot jump wall on distance " + distance);
        } else
            System.out.println("The robot not jump wall on distance " + distance + " Passed is: " + this.getMaxClampingHeight());
    }
}