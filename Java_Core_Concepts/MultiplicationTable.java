// 19. Program to print a table of any number.
import java.util.Scanner;
// This program prints the table of a given number.
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati, 0873AL231017(AIML)");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to print its table: ");
        int number = scanner.nextInt();
        
        System.out.printf("table of %d:%n", number);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", number, i, number * i);
        }
        
        scanner.close();
    }
}