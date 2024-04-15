package calcul;

import java.util.Scanner;

public class Input {

    static Scanner getSymbol() {
        System.out.println("Set value:");
        return new Scanner(System.in);
    }

    static Scanner getStringSymbol() {
        System.out.println("Set operation (/,+,-,*,%):");
        return new Scanner(System.in);
    }
}