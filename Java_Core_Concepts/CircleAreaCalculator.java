// 30. Create a class to calculate Area of circle with one data member to store the radius and
// another to store area value.
// Create method members
// 1. init - to input radius from user
// 2. calc - to calculate area
// 3. display- to display area
import java.util.*;

class Circle {
    private double radius;
    private double area;

    // Method to input radius from user
    public void init() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        radius = sc.nextDouble();
    }

    // Method to calculate area
    public void calc() {
        area = Math.PI * radius * radius;
    }

    // Method to display area
    public void display() {
        System.out.printf("Area of the circle with radius %.2f is: %.2f%n", radius, area);
    }
}
public class CircleAreaCalculator {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.init();  // Input radius
        circle.calc();  // Calculate area
        circle.display(); // Display area
    }
}