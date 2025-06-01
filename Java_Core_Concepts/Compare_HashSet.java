// 75. Write a Java program to compare two HashSets.
import java.util.*;
public class Compare_HashSet {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        
        // Create two HashSets
        HashSet<String> set1 = new HashSet<String>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Orange");

        HashSet<String> set2 = new HashSet<String>();
        set2.add("Apple");
        set2.add("Banana");
        set2.add("Grapes");

        // Compare the two HashSets
        if (set1.equals(set2)) {
            System.out.println("The two HashSets are equal.");
        } else {
            System.out.println("The two HashSets are not equal.");
            System.out.println("HashSet 1: " + set1);
            System.out.println("HashSet 2: " + set2);
        }
    }
}