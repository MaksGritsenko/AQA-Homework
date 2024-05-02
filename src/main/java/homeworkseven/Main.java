package homeworkseven;

public class Main {

    public static void main(String[] args) {
        Member cat = new Cat(12, 8);
        Member human = new Human(8, 3);
        Member robot = new Robot(20, 15);
        Barrier wall = new Wall(7);
        Barrier racetrack = new Racetrack(11);

        Member[] members = {cat, human, robot};
        Barrier[] barriers = {wall, racetrack};

        start(members, barriers);
    }

    public static void start(Member[] members, Barrier[] barriers) {
        for (Member member : members)
            for (Barrier barrier : barriers) {
                if (!barrier.overcome(member)) {
                    break;
                }
            }
    }
}