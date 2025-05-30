// 26. Sort a ten element array in descending order.
import java.util.*;
public class ArraySortDescending {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati, 0873AL231017(AIML)");
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        
        // Accepting array elements from the user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        
        // Sorting the array in descending order
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        
        System.out.println("Array sorted in descending order:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        
        sc.close();
    }
}