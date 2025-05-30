// 31. Create a class MathOperation with two data member X and Y to store the operand and
// third data member R to store result of operation.
// Create method members
// ● init - to input X and Y from user
// ● add - to add X and Y and store in R
// ● multiply - to multiply X and Y and store in R
// ● power - to calculate X Y and store in R
// ● display- to display Result R
import java.util.*;

class MathOperation {
    private double X;
    private double Y;
    private double R;

    // Method to input X and Y from user
    public void init() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for X: ");
        X = sc.nextDouble();
        System.out.print("Enter value for Y: ");
        Y = sc.nextDouble();
    }

    // Method to add X and Y and store in R
    public void add() {
        R = X + Y;
    }

    // Method to multiply X and Y and store in R
    public void multiply() {
        R = X * Y;
    }

    // Method to calculate X^Y and store in R
    public void power() {
        R = Math.pow(X, Y);
    }

    // Method to display Result R
    public void display() {
        System.out.printf("Result: %.2f%n", R);
    }
}
public class MathOperationDemo {
    public static void main(String[] args) {
        MathOperation operation = new MathOperation();
        operation.init();  // Input X and Y
        operation.add();   // Add X and Y
        operation.display(); // Display result of addition

        operation.multiply(); // Multiply X and Y
        operation.display(); // Display result of multiplication

        operation.power(); // Calculate X^Y
        operation.display(); // Display result of power
    }
}