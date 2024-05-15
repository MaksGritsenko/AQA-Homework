package homeworkeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Slicer {

    public static void slicer(String incomeString) {
        Set<String> sliceSt = new HashSet<>();
        String[] replaceString = incomeString.replaceAll("[,.]", "").split(" ");
        for (String toUpperSting : replaceString) {
            sliceSt.add(toUpperSting.substring(0, 1).toUpperCase() + toUpperSting.substring(1).toLowerCase());
        }
        for (String result : sliceSt) {
            System.out.println(result);
        }
    }
}
