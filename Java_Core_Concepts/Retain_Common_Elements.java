// 76. Write a Java program to retain common elements from two sets.
import java.util.*;
public class Retain_Common_Elements {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        
        // Creating two sets
        Set<String> set1 = new HashSet<String>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Orange");
        
        Set<String> set2 = new HashSet<String>();
        set2.add("Banana");
        set2.add("Grapes");
        set2.add("Orange");
        
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        
        // Retaining common elements
        set1.retainAll(set2);
        
        System.out.println("Common elements: " + set1);
    }
}