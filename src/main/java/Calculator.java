package src.main.java;

import static src.main.java.Calculation.calculate;
import static src.main.java.GetInputs.getNumber;
import static src.main.java.GetInputs.getOperation;

public class Calculator {
    public static void main(String[] args) {
        double num1 = getNumber();
        double num2 = getNumber();
        String operator = getOperation();
        //System.out.println("The given numbers and operation are: "+num1 + ", " +num2 + " and " +operator);
        double result = calculate(num1,num2,operator);
        System.out.println("The result of the "+operator+" for "+num1+" and "+num2+" is: " +result);
    }
}
