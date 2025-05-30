/*13. Find the result of following (accept values for variables used in right side of
expression)
a. y=x 2 +3x-7 (print value of Z)
b. y=x++ + ++x (print value of x and y)
c. z= x++ - --y - --x + x++ (print value of x ,y and z)
d. z = x &amp;&amp; y || !(x||y) (print value of Z) */
// write a program one by one for each expression
import java.util.Scanner;

public class ExpressionEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Expression a
        System.out.print("Enter value for x: ");
        int x = scanner.nextInt();
        int y = x * x + 3 * x - 7;
        System.out.printf("For expression a: y = %d%n", y);

        // Expression b
        System.out.print("Enter value for x: ");
        x = scanner.nextInt();
        int y2 = x++ + ++x;
        System.out.printf("For expression b: x = %d, y = %d%n", x, y2);

        // Expression c
        System.out.print("Enter value for x: ");
        x = scanner.nextInt();
        int y3 = x++;
        int z = x++ - --y3 - --x + x++;
        System.out.printf("For expression c: x = %d, y = %d, z = %d%n", x, y3, z);

        // Expression d
        System.out.print("Enter value for x: ");
        x = scanner.nextInt();
        System.out.print("Enter value for y: ");
        int y4 = scanner.nextInt();
        boolean z2 = (x != 0 && y4 != 0) || !(x != 0 || y4 != 0);
        System.out.printf("For expression d: z = %b%n", z2);

        scanner.close();
    }
}
