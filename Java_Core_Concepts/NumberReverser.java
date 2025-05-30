// Program to reverse a given number.
import java.util.Scanner;
// This program reverses a given integer number.
public class NumberReverser {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati, 0873AL231017(AIML)");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer number to reverse: ");
        int number = scanner.nextInt();
        
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        System.out.printf("Reversed number: %d%n", reversedNumber);
        
        scanner.close();
    }
}