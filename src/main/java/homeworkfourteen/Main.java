package homeworkfourteen;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Map<String, List<User>> groupedUsers = Stream.generate(UserFactory::createUser)
                .distinct()
                .limit(20)
                .filter(user -> user.getAge() > 18)
                .sorted(Comparator.comparing(User::getUsername))
                .filter(user -> user.getEmail().isEmpty()).collect(Collectors.groupingBy(User::getGender));

        System.out.println("List before sorting:");
        System.out.println(groupedUsers);
        System.out.println("After sorting:");

        groupedUsers.forEach((gender, userList) -> {
            List<String> names = userList.stream().map(User::getUsername).toList();
            System.out.print("{" + gender + "=" + names + "}, ");
        });
    }
}
