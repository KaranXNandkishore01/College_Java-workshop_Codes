// Program to calculate sum of 5 subjects &amp; find percentage.
import java.util.Scanner;
// This program calculates the sum of marks in 5 subjects and finds the percentage.

public class MarksCalculator {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati, 0873AL231017(AIML)");
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int numberOfSubjects = 5;

        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double percentage = (double) totalMarks / numberOfSubjects;
        System.out.printf("Total Marks: %d%n", totalMarks);
        System.out.printf("Percentage: %.2f%%%n", percentage);

        scanner.close();
    }
}
