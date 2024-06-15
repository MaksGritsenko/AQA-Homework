package homeworkthirteen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> listStudents = new ArrayList<>();
        Comparator<Student> comparator;

        for (int i = 0; i < 8; i++) {
            listStudents.add(StudentsFactory.createStudents());
        }
        System.out.println("List before sorting:");
        System.out.println(listStudents);
        comparator = (s1, s2) -> {
            int i = s2.getGrade().compareTo(s1.getGrade());
            if (i == 0) {
                int j = s1.getAge().compareTo(s2.getAge());
                if (j == 0) {
                    return s1.getName().compareTo(s2.getName());
                }
                return j;
            }
            return i;
        };
        listStudents.sort(comparator);
        System.out.println("List after sorting:");
        System.out.println(listStudents);
    }
}
