// WAP for Lambda Expression
import java.util.*;
public class LambdaExpressionExample {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        // Creating a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using a lambda expression to print each number
        numbers.forEach(number -> System.out.println("Number: " + number));

        // Using a lambda expression to filter and print even numbers
        System.out.println("Even Numbers:");
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(n -> System.out.println("Even Number: " + n));
    }
}