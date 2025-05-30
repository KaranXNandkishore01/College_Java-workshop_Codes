// 23. Calculate sum of Lucas series (up to 10 terms) :
// 1, 2, 3, 6, 11, 20 ,........
import java.util.Scanner;
// This program calculates the sum of the first 10 terms of the Lucas series. 
public class LucasSeriesSum {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati, 0873AL231017(AIML)");
        Scanner sc = new Scanner(System.in);
        
        int n = 10; // Number of terms in the Lucas series
        int firstTerm = 2; // L(0)
        int secondTerm = 1; // L(1)
        int sum = firstTerm + secondTerm; // Initial sum with first two terms
        
        System.out.print("Lucas series: " + firstTerm + ", " + secondTerm);
        
        for (int i = 2; i < n; i++) {
            int nextTerm = firstTerm + secondTerm; // L(n) = L(n-1) + L(n-2)
            System.out.print(", " + nextTerm);
            sum += nextTerm; // Add the next term to the sum
            firstTerm = secondTerm; // Update for next iteration
            secondTerm = nextTerm;
        }
        
        System.out.printf("%nSum of the first %d terms of the Lucas series: %d%n", n, sum);
        
        sc.close();
    }
}