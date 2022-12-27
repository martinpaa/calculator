package src.main.java;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        double num1 = getNumber();
        double num2 = getNumber();
        String operator = getOperation();
        //System.out.println("The given numbers and operation are: "+num1 + ", " +num2 + " and " +operator);
        double result = calculate(num1,num2,operator);
        System.out.println("The result of the "+operator+" for "+num1+" and "+num2+" is: " +result);
    }

    private static double getNumber(){
        System.out.println("Insert a number for the operation.");
        Scanner reader = new Scanner(System.in);
        double number;
        if(reader.hasNextDouble()){
            number = reader.nextDouble();
        } else {
            System.out.println("Invalid input.");
            number = getNumber();
        }
        return number;
    }

    private static String getOperation(){
        System.out.println("Insert operation: addition, subtraction, multiplication or division.");
        Scanner reader = new Scanner(System.in);
        String operator = reader.next();
        boolean check= checkOperation(operator);
        if (!check){
            System.out.println("Invalid operation.");
            return getOperation();
        }else{
            return operator;
        }
    }

    private static boolean checkOperation(String operator){
        return operator.equals("addition") || operator.equals("subtraction") || operator.equals("multiplication") || operator.equals("division");
    }

    private static double calculate(double num1, double num2, String operator){
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
