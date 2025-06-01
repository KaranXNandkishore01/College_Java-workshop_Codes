// 66. Write a Java program to display the elements of a TreeSet in reverse order.
import java.util.*;
public class Display_TreeSet_Reverse {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        
        // Creating a TreeSet and adding elements
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Grapes");
        
        System.out.println("Original TreeSet: " + treeSet);
        
        // Displaying the elements in reverse order
        System.out.println("TreeSet in reverse order:");
        NavigableSet<String> reverseTreeSet = treeSet.descendingSet();
        for (String element : reverseTreeSet) {
            System.out.println(element);
        }
    }
}