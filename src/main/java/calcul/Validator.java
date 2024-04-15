package calcul;

import java.util.Scanner;

import static calcul.Input.getStringSymbol;
import static calcul.Input.getSymbol;

public class Validator {

    public static double getDoubleSymbol() {
        Scanner symbol = getSymbol();
        if (isDouble(symbol)) {
            return symbol.nextDouble();
        } else {
            System.out.println("There is no double symbol");
            System.exit(0);
            return 0;
        }
    }

    public static String getMathSymbol() {
        String symbol = getStringSymbol().next();
        if (isMathSymbol(symbol)) {
            return symbol;
        } else {
            System.out.println("There is no math symbol");
            System.exit(0);
            return "";
        }
    }

    public static boolean isNull(double value) {
        return value == 0;
    }

    private static boolean isDouble(Scanner symbol) {
        return symbol.hasNextDouble();
    }

    private static boolean isMathSymbol(String symbol) {
        return symbol.equals("-")
                || symbol.equals("+")
                || symbol.equals("/")
                || symbol.equals("*")
                || symbol.equals("%");
    }
}
