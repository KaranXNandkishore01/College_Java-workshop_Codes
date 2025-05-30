//Program to find the simple interest.
import java.util.Scanner;
// This program calculates the simple interest based on principal, rate, and time. 
public class SimpleInterestCalculator {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati, 0873AL231017(AIML)");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter the rate of interest (in %): ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter the time (in years): ");
        double time = scanner.nextDouble();
        
        double simpleInterest = (principal * rate * time) / 100;
        
        System.out.printf("Simple Interest: %.2f%n", simpleInterest);
        
        scanner.close();
    }
}