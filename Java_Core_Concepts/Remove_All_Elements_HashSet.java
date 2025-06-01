// 77. Write a Java program to remove all elements from a HashSet.
import java.util.*;
public class Remove_All_Elements_HashSet {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        
        // Creating a HashSet and adding elements
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        
        System.out.println("Original HashSet: " + hashSet);
        
        // Removing all elements from the HashSet
        hashSet.clear();
        
        System.out.println("HashSet after removing all elements: " + hashSet);
    }
}