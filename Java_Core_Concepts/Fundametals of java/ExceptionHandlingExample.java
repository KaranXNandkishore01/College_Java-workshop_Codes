//WAP for Exception Handling(Try – catch-finally)
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
// This program demonstrates exception handling in Java using try-catch-finally blocks.