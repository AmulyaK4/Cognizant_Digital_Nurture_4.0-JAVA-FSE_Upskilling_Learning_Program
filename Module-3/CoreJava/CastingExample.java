public class CastingExample {
    public static void main(String[] args) {
        double decimalValue = 7.9;
        int intValue = (int) decimalValue;
        System.out.println("Converted double to int: " + intValue);

        int wholeNumber = 15;
        double doubleValue = wholeNumber;
        System.out.println("Converted int to double: " + doubleValue);
    }
}

