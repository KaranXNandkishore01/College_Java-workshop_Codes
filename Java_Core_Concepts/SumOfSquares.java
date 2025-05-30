// 22. Calculate series : 1 2 +2 2 +3 2 +4 2 +.........+n 2
import java.util.Scanner;
// This program calculates the sum of squares of the first n natural numbers.  
public class SumOfSquares {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati, 0873AL231017(AIML)");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += i * i; // Adding the square of each number
        }
        
        System.out.printf("The sum of squares from 1 to %d is: %d%n", n, sum);
        
        scanner.close();
    }
}