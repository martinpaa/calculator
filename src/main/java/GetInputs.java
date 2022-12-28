package src.main.java;

import java.util.Scanner;

public class GetInputs {
    public static double getNumber(){
        System.out.println("Insert a number for the operation.");
        Scanner reader = new Scanner(System.in);
        double number;
        if(reader.hasNextDouble()){
            number = reader.nextDouble();
            return number;
        } else {
            System.out.println("Invalid input.");
            return getNumber();
        }
    }
    public static String getOperation(){
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
}
