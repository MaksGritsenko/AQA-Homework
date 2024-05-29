package homeworknine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] words = {"car", "bus", "bus", "cat", "dog","dog", "car", "car", "bird","wolf","bird","bird","car"};
        List<String> list = new ArrayList<>();
        for (String s: words) {
            list.add(s);
        }

        System.out.println("The word you're looking for is repeated:"+CollectionMethods.countOccurance(list, "car"));
        System.out.println("-------------------------------------");
        CollectionMethods.calcOccurance(list);
        System.out.println("-------------------------------------");
        CollectionMethods.findOccurance(list);

    }
}
