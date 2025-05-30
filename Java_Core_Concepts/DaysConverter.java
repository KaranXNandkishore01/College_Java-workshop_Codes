// Write a program which accepts days(eg. 670 days) as integer and display total number of years, months and days in it.
import java.util.Scanner;
// This program converts a given number of days into years, months, and remaining days.
public class DaysConverter {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati, 0873AL231017(AIML)");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();

        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int months = remainingDays / 30;
        remainingDays = remainingDays % 30;

        System.out.printf("%d days is approximately %d years, %d months, and %d days.%n",
                totalDays, years, months, remainingDays);

        scanner.close();
    }
}