// WAP for Precedence
public class OperatorPrecedence {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 20;

        // Using parentheses to change precedence
        int result = a + b * c; // Without parentheses
        System.out.println("Without parentheses: " + result);

        result = (a + b) * c; // With parentheses
        System.out.println("With parentheses: " + result);
    }
}
