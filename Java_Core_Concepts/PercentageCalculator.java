// 8. Program to calculate sum of 5 subjects &amp; find percentage.
import java.util.*;
public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for 5 subjects: ");
        
        double totalMarks = 0;
        for (int i = 0; i < 5; i++) {
            totalMarks += sc.nextDouble();
        }
        
        double percentage = (totalMarks / 500) * 100;
        System.out.printf("Total Marks: %.2f, Percentage: %.2f%%\n", totalMarks, percentage);
        
        sc.close();
    }
}