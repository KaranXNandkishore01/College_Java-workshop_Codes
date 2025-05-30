// 25. Program to show sum and average of 10 element array. Accept array elements from user.
import java.util.Scanner;
// This program calculates the sum and average of an array of 10 elements entered by the user.
public class ArraySumAndAverage {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati, 0873AL231017(AIML)");
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[10];
        int sum = 0;
        
        // Accepting array elements from the user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        
        double average = (double) sum / numbers.length;
        
        System.out.printf("Sum of array elements: %d%n", sum);
        System.out.printf("Average of array elements: %.2f%n", average);
        
        scanner.close();
    }
}