// 27. Create a array of 17 elements in 5 rows. And calculate sum of all elements.
import java.util.Scanner;
public class Array17Sum {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati, 0873AL231017(AIML)");
        Scanner sc = new Scanner(System.in);

        int[][] array = new int[5][17];
        int sum = 0;

        // Accepting elements for the 2D array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("Enter element [%d][%d]: ", i, j);
                array[i][j] = sc.nextInt();
                sum += array[i][j];
            }
        }

        System.out.printf("Sum of all elements in the array: %d%n", sum);

        sc.close();
    }
}
