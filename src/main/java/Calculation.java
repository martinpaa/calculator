public class Calculation {
    public static double calculate(double num1, double num2, String operator){
        double result = switch (operator) {
            case "addition" -> num1 + num2;
            case "subtraction" -> num1 - num2;
            case "multiplication" -> num1 * num2;
            case "division" -> num1 / num2;
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
        return result;
    }
}
