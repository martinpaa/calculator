public class Calculator {
    public static void main(String[] args) {
        double num1 = GetInputs.getNumber();
        double num2 = GetInputs.getNumber();
        String operator = GetInputs.getOperation();
        double result = Calculation.calculate(num1,num2,operator);
        Writer.writeResult(operator, num1, num2, result);
    }
}
