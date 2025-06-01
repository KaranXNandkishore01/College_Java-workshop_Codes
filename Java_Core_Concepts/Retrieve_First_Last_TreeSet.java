// 67. Write a Java program to retrieve the first and last elements from a TreeSet.
import java.util.*;
public class Retrieve_First_Last_TreeSet {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        
        // Creating a TreeSet and adding elements
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Grapes");
        
        System.out.println("TreeSet: " + treeSet);
        
        // Retrieving the first element
        String firstElement = treeSet.first();
        System.out.println("First element in the TreeSet: " + firstElement);
        
        // Retrieving the last element
        String lastElement = treeSet.last();
        System.out.println("Last element in the TreeSet: " + lastElement);
    }
}