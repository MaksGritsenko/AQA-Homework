package homeworkseven;

public class Wall implements Barrier {

    private int height;

    protected Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Member member) {
        if (member.getMaxClampingHeight() > height) {
            member.jump(true, height);
            return true;
        } else {
            member.jump(false, height);
            return false;
        }
    }
}