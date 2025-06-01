// 68. Write a Java program to clone a TreeSet into another TreeSet
import java.util.*;
public class Clone_TreeSet {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        
        // Creating the original TreeSet and adding elements
        TreeSet<String> originalTreeSet = new TreeSet<String>();
        originalTreeSet.add("Apple");
        originalTreeSet.add("Banana");
        originalTreeSet.add("Orange");
        
        System.out.println("Original TreeSet: " + originalTreeSet);
        
        // Cloning the TreeSet
        TreeSet<String> clonedTreeSet = (TreeSet<String>) originalTreeSet.clone();
        
        System.out.println("Cloned TreeSet: " + clonedTreeSet);
    }
}