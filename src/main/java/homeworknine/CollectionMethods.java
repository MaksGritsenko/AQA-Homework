package homeworknine;

import java.lang.reflect.Array;
import java.util.*;

import static java.util.stream.Collectors.toList;

public class CollectionMethods {

    private static int count = 0;

    public static int countOccurance(List<String> list, String word) {
        if (!list.contains(word)) {
            System.out.println("Non words");
        } else {
            for (String lists : list) {
                if (lists.toLowerCase().equals(word.toLowerCase())) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void calcOccurance (List<String> list) {
        List<String> list2 = new ArrayList<>(list);
        int count = 0;
        while (list2.iterator().hasNext()) {
            List<String> list1 = new ArrayList<>();
            String word = list2.iterator().next();
            for (String s : list2) {
                if (s.equals(word)) {
                    count++;
                    list1.add(s);
                }
            }
            list2.removeAll(list1);
            System.out.println(word + ":" + count);
            count = 0;
        }

    }

    public static void findOccurance (List<String> list) {
        int count = 0;
        List<String> list1 = new ArrayList<>();
        List<Counter> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>(list);
        Map<String, Integer> map = new HashMap<>();
        while (list3.iterator().hasNext()) {
            String word = list3.iterator().next();
            for (String s : list3) {
                if (s.equals(word)) {
                    count++;
                    list1.add(s);
                    map.put(word, count);
                }
            }
            list3.removeAll(list1);
            count = 0;
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list2.add(new Counter(entry.getKey(), entry.getValue()));
            System.out.println(map.getOrDefault("car", 4));
        }
        System.out.println(list2);
    }
}
