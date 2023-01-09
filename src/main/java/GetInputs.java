public class GetInputs {
    public static double getNumber(){
        Writer.askForNumber();
        return Reader.readNumber();
    }
    public static String getOperation(){
        Writer.askForOperator();
        return Reader.readOperator();
    }
}
