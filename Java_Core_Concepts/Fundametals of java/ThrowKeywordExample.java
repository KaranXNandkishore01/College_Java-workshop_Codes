//WAP for  throw keyword
public class ThrowKeywordExample {
    public static void main(String[] args) {
        try {
            checkAge(15); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }
}