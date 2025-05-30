// 32. Create a class MathOperation containing method ‘multiply’ to calculate multiplication
// of following arguments.
// a. two integers
// b. three float
// c. all elements of array
// d. one double and one integer
//write a program one by one to test the above method by using cases choice.

import java.util.*;
class MathOperation {
    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to multiply three floats
    public float multiply(float a, float b, float c) {
        return a * b * c;
    }

    // Method to multiply all elements of an array
    public double multiply(double[] arr) {
        double result = 1.0;
        for (double num : arr) {
            result *= num;
        }
        return result;
    }

    // Method to multiply one double and one integer
    public double multiply(double a, int b) {
        return a * b;
    }
}
public class MathOperationXDemo {
    public static void main(String[] args) {
        MathOperation operation = new MathOperation();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose an operation:");
        System.out.println("1. Multiply two integers");
        System.out.println("2. Multiply three floats");
        System.out.println("3. Multiply all elements of an array");
        System.out.println("4. Multiply one double and one integer");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter first integer: ");
                int a = sc.nextInt();
                System.out.print("Enter second integer: ");
                int b = sc.nextInt();
                System.out.println("Result: " + operation.multiply(a, b));
                break;

            case 2:
                System.out.print("Enter first float: ");
                float f1 = sc.nextFloat();
                System.out.print("Enter second float: ");
                float f2 = sc.nextFloat();
                System.out.print("Enter third float: ");
                float f3 = sc.nextFloat();
                System.out.println("Result: " + operation.multiply(f1, f2, f3));
                break;

            case 3:
                System.out.print("Enter number of elements in array: ");
                int n = sc.nextInt();
                double[] arr = new double[n];
                for (int i = 0; i < n; i++) {
                    System.out.print("Enter element " + (i + 1) + ": ");
                    arr[i] = sc.nextDouble();
                }
                System.out.println("Result: " + operation.multiply(arr));
                break;

            case 4:
                System.out.print("Enter a double value: ");
                double d = sc.nextDouble();
                System.out.print("Enter an integer value: ");
                int i = sc.nextInt();
                System.out.println("Result: " + operation.multiply(d, i));
                break;

            default:
                System.out.println("Invalid choice!");
        }
        
        sc.close();
    }
}