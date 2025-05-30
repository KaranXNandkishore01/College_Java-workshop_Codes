//18. Accept person age(int), gender(int 1 for male and 0 for female), then check whether
// person is
// eligible for marriage or not.
import java.util.Scanner;
// This program checks if a person is eligible for marriage based on age and gender
public class MarriageEligibilityChecker {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati, 0873AL231017(AIML)");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter gender (1 for male, 0 for female): ");
        int gender = scanner.nextInt();

        boolean isEligible = false;

        if (gender == 1) { // Male
            if (age >= 21) {
                isEligible = true;
            }
        } else if (gender == 0) { // Female
            if (age >= 18) {
                isEligible = true;
            }
        }

        if (isEligible) {
            System.out.println("The person is eligible for marriage.");
        } else {
            System.out.println("The person is not eligible for marriage.");
        }

        scanner.close();
    }
}
