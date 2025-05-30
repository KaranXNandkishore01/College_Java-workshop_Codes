//Program to convert temperature from Fahrenheit to Celsius as C= 5*(f-32)/9
import java.util.Scanner;
// This program converts a temperature from Fahrenheit to Celsius using the formula C = 5 * (F - 32) / 9.
public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati, 0873AL231017(AIML)");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        double celsius = 5 * (fahrenheit - 32) / 9;
        
        System.out.printf("Temperature in Celsius: %.2f%n", celsius);
        
        scanner.close();
    }
}