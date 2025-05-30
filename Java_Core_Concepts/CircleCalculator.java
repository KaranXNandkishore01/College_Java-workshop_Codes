// write a program to find area  and circumference of circle
import java.util.Scanner;
// This program calculates the area and circumference of a circle based on the radius provided by the user.
public class CircleCalculator {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati, 0873AL231017(AIML)");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.printf("Area of the circle: %.2f%n", area);
        System.out.printf("Circumference of the circle: %.2f%n", circumference);

        scanner.close();
    }
}