package homeworkseven;

public abstract class Member {

    private int maxRunningDistance;
    private int maxClampingHeight;

    protected Member(int maxRunningDistance, int maxClampingHeight) {
        this.maxRunningDistance = maxRunningDistance;
        this.maxClampingHeight = maxClampingHeight;
    }

    public abstract void run(boolean isSuccess, int distance);

    public abstract void jump(boolean isSuccess, int distance);

    public int getMaxRunningDistance() {
        return maxRunningDistance;
    }

    public int getMaxClampingHeight() {
        return maxClampingHeight;
    }
}
