// 70. Write a Java program to compare two TreeSets.
import java.util.*;
public class Compare_TreeSet {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        
        // Create two TreeSets
        TreeSet<String> set1 = new TreeSet<String>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Orange");

        TreeSet<String> set2 = new TreeSet<String>();
        set2.add("Apple");
        set2.add("Banana");
        set2.add("Grapes");

        // Compare the two TreeSets
        if (set1.equals(set2)) {
            System.out.println("The two TreeSets are equal.");
        } else {
            System.out.println("The two TreeSets are not equal.");
            System.out.println("TreeSet 1: " + set1);
            System.out.println("TreeSet 2: " + set2);
        }
    }
}