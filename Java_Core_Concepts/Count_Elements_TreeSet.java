// 69. Write a Java program to count the number of elements in a TreeSet.
import java.util.*;
public class Count_Elements_TreeSet {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        
        // Creating a TreeSet and adding elements
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Grapes");
        
        System.out.println("TreeSet: " + treeSet);
        
        // Counting the number of elements in the TreeSet
        int count = treeSet.size();
        System.out.println("Number of elements in the TreeSet: " + count);
    }
}