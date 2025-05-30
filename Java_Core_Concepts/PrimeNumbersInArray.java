// 41. Write a prog. to find prime numbers in an array. 
import java.util.*;

public class PrimeNumbersInArray {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati, 0873AL231017(AIML)");
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> primeNumbers = new ArrayList<>();

        for (int num : numbers) {
            if (isPrime(num)) {
                primeNumbers.add(num);
            }
        }

        System.out.println("Prime numbers in the array: " + primeNumbers);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}