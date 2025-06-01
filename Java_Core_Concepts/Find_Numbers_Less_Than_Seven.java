// 74. Write a Java program to find numbers less than 7 in a TreeSet.
import java.util.*;
public class Find_Numbers_Less_Than_Seven {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        
        // Creating a TreeSet and adding elements
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(7);
        treeSet.add(9);
        treeSet.add(2);
        
        System.out.println("Original TreeSet: " + treeSet);
        
        // Finding numbers less than 7
        System.out.println("Numbers less than 7 in the TreeSet:");
        for (Integer number : treeSet) {
            if (number < 7) {
                System.out.println(number);
            }
        }
    }
}