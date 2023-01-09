import java.util.Scanner;

public class Reader {
    public static double readNumber (){
        Scanner reader = new Scanner(System.in);
        double number;
        if(reader.hasNextDouble()){
            number = reader.nextDouble();
            return number;
        } else {
            System.out.println("Invalid input.");
            Writer.askForNumber();
            return readNumber();
        }
    }

    public static String readOperator () {
        Scanner reader = new Scanner(System.in);
        String operator = reader.next();
        boolean check= checkOperation(operator);
        if (!check){
            System.out.println("Invalid operation.");
            Writer.askForOperator();
            return readOperator();
        }else{
            return operator;
        }
    }

    private static boolean checkOperation(String operator){
        return operator.equals("addition") || operator.equals("subtraction") || operator.equals("multiplication") || operator.equals("division");
    }
}
