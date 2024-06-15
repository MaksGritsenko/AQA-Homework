package homeworkfourteen;

import java.util.Random;

public class UserFactory {

    private static final String[] NAME = {"Max", "Nick", "Inna", "Maria", "Oleg", "Danil", "Roma", "Nika"};
    private static final String[] EMAILS ={"qq@gmail.com", "tt@yahoo.com", "qq@outlook.com", "gg@hotmail.com","gg@apple.id","",""};
    private static final String[] GENDER = {"Male", "Female"};
    private static final int[] AGE = {18, 22, 17, 21, 25, 23};

    public static User createUser() {
        Random random = new Random();
        String name = NAME[random.nextInt(NAME.length)];
        String email = EMAILS[random.nextInt(EMAILS.length)];
        String gender = GENDER[random.nextInt(GENDER.length)];
        int age = AGE[random.nextInt(AGE.length)];
        return new User(name, email, gender, age);
    }
}
