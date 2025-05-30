// 24. Print all prime numbers between two given numbers;
import java.util.Scanner;
// This program prints all prime numbers between two given numbers.
public class PrimeNumbersBetween {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati, 0873AL231017(AIML)");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the 1st No.: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the 2nd No.: ");
        int upperBound = scanner.nextInt();
        
        System.out.printf("Prime numbers between %d and %d are:%n", lowerBound, upperBound);
        
        for (int number = lowerBound; number <= upperBound; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
        
        System.out.println(); // New line after printing all prime numbers
        scanner.close();
    }
    
    private static boolean isPrime(int number) {
        if (number <= 1) return false; // Numbers less than or equal to 1 are not prime
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false; // Found a divisor, not prime
        }
        return true; // Number is prime
    }
}