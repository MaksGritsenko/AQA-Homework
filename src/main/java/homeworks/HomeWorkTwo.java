package homeworks;

import java.util.Arrays;
import java.util.Random;

public class HomeWorkTwo {

    public static void main(String[] args) {

        /**
         HomeWork 2.1:
         - Get sum value greater than five and less than forty-five:
         - Get all paired value in array;
         /**/

        int sumValue = 0;
        String allPairedValues = "";
        int minimumValueInArray = -15;
        int maximumValueInArray = 75;
        int[] outgoingArray = new int[20];
        Random randomValueInArray = new Random();
        int outgoingArrayLength = outgoingArray.length;

        for (int i = 0; i < outgoingArrayLength; i++) {
            outgoingArray[i] = randomValueInArray.nextInt(maximumValueInArray - minimumValueInArray) + minimumValueInArray;
        }

        System.out.println("Outgoing array: " + Arrays.toString(outgoingArray) + "\n");

        for (int i = 0; i < outgoingArrayLength; i++) {
            if (outgoingArray[i] > 5 && outgoingArray[i] < 45) {
                sumValue += outgoingArray[i];
            }
            if (outgoingArray[i] % 2 == 0 && outgoingArray[i] > 0) {
                allPairedValues += outgoingArray[i] + " ";
            }
        }

        System.out.println("Sum value greater than five and less than forty-five: " + sumValue + "\n");
        System.out.println("All paired value in array: " + allPairedValues);

    }
}
