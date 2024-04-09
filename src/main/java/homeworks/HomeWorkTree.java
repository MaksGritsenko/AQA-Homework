package homeworks;

import java.util.Arrays;
import java.util.Random;

public class HomeWorkTree {
    public static void main(String[] args) {

        /**
         HomeWork 2.2:
         - Get sort array;
         /**/

        int minimumValueInArray = 1;
        int maximumValueInArray = 100;
        int[] outgoingArray = new int[20];
        Random randomValueInArray = new Random();
        int outgoingArrayLength = outgoingArray.length;

        for (int i = 0; i < outgoingArrayLength; i++) {
            outgoingArray[i] = randomValueInArray.nextInt(maximumValueInArray - minimumValueInArray) + minimumValueInArray;
        }
        System.out.println("Outgoing array: " + Arrays.toString(outgoingArray));

        for (int i = 0; i < outgoingArrayLength; i++) {
            for (int j = i + 1; j < outgoingArrayLength; j++) {
                if (outgoingArray[i] > outgoingArray[j]) {
                    int saverValue = outgoingArray[i];
                    outgoingArray[i] = outgoingArray[j];
                    outgoingArray[j] = saverValue;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(outgoingArray));
    }
}
