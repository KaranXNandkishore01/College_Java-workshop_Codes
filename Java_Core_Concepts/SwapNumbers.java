//Program to swap two no’s without using third variable.
import java.util.Scanner;
// This program swaps two numbers without using a third variable.
public class SwapNumbers {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati, 0873AL231017(AIML)");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        
        // Swapping logic
        a = a + b; // Step 1: Add both numbers
        b = a - b; // Step 2: Subtract the new value of 'a' with 'b' to get original 'a'
        a = a - b; // Step 3: Subtract the new value of 'b' from 'a' to get original 'b'
        
        System.out.printf("After swapping: First number = %d, Second number = %d%n", a, b);
        
        scanner.close();
    }
}