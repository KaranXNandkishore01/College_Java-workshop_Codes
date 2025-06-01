// Pattern Printing
//  Write a Java program to print a pattern of numbers in a pyramid shape.
import java.util.*;
public class PyramidPattern {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        int rows = 5; // Number of rows in the pyramid

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(k);
            }
            // Move to the next line
            System.out.println();
        }
    }
}