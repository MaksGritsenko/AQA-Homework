package homeworkseven;

public class Cat extends Member {

    protected Cat(int maxRunningDistance, int maxClampingHeight) {
        super(maxRunningDistance, maxClampingHeight);
    }

    @Override
    public void run(boolean isSuccess, int distance) {
        if (isSuccess) {
            System.out.println("The cat run racetrack on distance " + distance);
        } else
            System.out.println("The cat not run racetrack on distance " + distance + " Passed is: " + this.getMaxRunningDistance());
    }

    @Override
    public void jump(boolean isSuccess, int distance) {
        if (isSuccess) {
            System.out.println("The cat jump wall on distance " + distance);
        } else
            System.out.println("The cat not jump wall on distance " + distance + " Passed is: " + this.getMaxClampingHeight());
    }
}