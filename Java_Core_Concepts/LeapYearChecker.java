//17. Program to check that entered year is leap year or not.
import java.util.Scanner;
// This program checks if a given year is a leap year or not.
public class LeapYearChecker {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati, 0873AL231017(AIML)");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a year to check if it is a leap year: ");
        int year = scanner.nextInt();
        
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        if (isLeapYear) {
            System.out.printf("%d is a leap year.%n", year);
        } else {
            System.out.printf("%d is not a leap year.%n", year);
        }
        
        scanner.close();
    }
}