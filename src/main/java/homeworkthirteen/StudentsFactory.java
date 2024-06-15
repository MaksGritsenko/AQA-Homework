package homeworkthirteen;

import java.util.Random;

public class StudentsFactory {

    private static final String[] NAME = {"Max", "Nick", "Inna", "Maria", "Oleg", "Danil", "Roma", "Nika"};
    private static final Integer[] AGE = {18, 22, 17, 21, 25, 23};
    private static final Double[] GRADE = {3.2, 3.6, 4.0, 4.2, 4.5, 4.7, 5.0, 3.0};

    public static Student createStudents() {
        Random random = new Random();
        String name = NAME[random.nextInt(NAME.length)];
        int age = AGE[random.nextInt(AGE.length)];
        double grade = GRADE[random.nextInt(GRADE.length)];
        return new Student(name, age, grade);
    }

}
