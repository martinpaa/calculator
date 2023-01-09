public class Writer {
    public static void askForNumber (){
        System.out.println("Insert a number for the operation.");
    }

    public static void askForOperator () {
        System.out.println("Insert operation: addition, subtraction, multiplication or division.");
    }

    public static void writeResult (String operator, double num1, double num2, double result){
        System.out.println("The result of the "+operator+" for "+num1+" and "+num2+" is: " +result);
    }
}
