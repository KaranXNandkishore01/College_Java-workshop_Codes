// 21. Program to check whether number is prime or not
import java.util.Scanner;
// This program checks if a given number is prime or not.
public class PrimeNumberChecker {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati, 0873AL231017(AIML)");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();
        
        boolean isPrime = true;
        
        if (number <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Found a divisor, not prime
                    break;
                }
            }
        }
        
        if (isPrime) {
            System.out.printf("%d is a prime number.%n", number);
        } else {
            System.out.printf("%d is not a prime number.%n", number);
        }
        
        scanner.close();
    }
}