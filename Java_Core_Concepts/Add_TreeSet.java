// 65. Write a Java program to add all elements from one TreeSet to another TreeSet.
import java.util.*;
public class Add_TreeSet {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        
        // Creating the first TreeSet and adding elements
        TreeSet<String> treeSet1 = new TreeSet<String>();
        treeSet1.add("Apple");
        treeSet1.add("Banana");
        treeSet1.add("Orange");
        
        System.out.println("First TreeSet: " + treeSet1);
        
        // Creating the second TreeSet and adding elements
        TreeSet<String> treeSet2 = new TreeSet<String>();
        treeSet2.add("Grapes");
        treeSet2.add("Mango");
        
        System.out.println("Second TreeSet: " + treeSet2);
        
        // Adding all elements from the first TreeSet to the second TreeSet
        treeSet2.addAll(treeSet1);
        
        System.out.println("TreeSet after adding all elements from the first TreeSet: " + treeSet2);
    }
}