package calcul;

import static calcul.Validator.*;

public class MathOperations {

    public static double calculate() {
        double firstSymbol = getDoubleSymbol();
        double secondSymbol = getDoubleSymbol();
        String mathSymbol = getMathSymbol();
        return switch (mathSymbol) {
            case "-" -> MathOperations.minus(firstSymbol, secondSymbol);
            case "+" -> MathOperations.plus(firstSymbol, secondSymbol);
            case "/" -> MathOperations.divide(firstSymbol, secondSymbol);
            case "*" -> MathOperations.multiply(firstSymbol, secondSymbol);
            case "%" -> MathOperations.percentage(firstSymbol, secondSymbol);
            default -> {
                System.exit(0);
                yield 0;
            }
        };
    }

    private static double plus(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }

    private static double minus(double firstValue, double secondValue) {
        return firstValue - secondValue;
    }

    private static double multiply(double firstValue, double secondValue) {
        return firstValue * secondValue;
    }

    private static double divide(double firstValue, double secondValue) {
        if (!isNull(secondValue)) {
            return firstValue / secondValue;
        } else {
            System.out.println("Cant divide on zero");
            System.exit(0);
            return 0;
        }
    }

    private static double percentage(double firstValue, double secondValue) {
        return firstValue / secondValue * 100;
    }
}
