// 73. Write a Java program to convert a HashSet into a TreeSet.
import java.util.*;
public class HashSet_To_TreeSet {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        
        // Creating a HashSet and adding elements
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        
        System.out.println("Original HashSet: " + hashSet);
        
        // Converting the HashSet to a TreeSet
        TreeSet<String> treeSet = new TreeSet<String>(hashSet);
        
        System.out.println("Converted TreeSet: " + treeSet);
    }
}