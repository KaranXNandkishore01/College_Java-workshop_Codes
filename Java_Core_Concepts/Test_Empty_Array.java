// 54. Write a Java program to test whether an array list is empty or not.
import java.util.*;
public class Test_Empty_Array {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        ArrayList<String> list = new ArrayList<String>();
        
        // Check if the array list is empty
        if (list.isEmpty()) {
            System.out.println("The array list is empty.");
        } else {
            System.out.println("The array list is not empty: " + list);
        }
        
        // Adding an element to the list
        list.add("Apple");
        
        // Check again if the array list is empty
        if (list.isEmpty()) {
            System.out.println("The array list is empty.");
        } else {
            System.out.println("The array list is not empty: " + list);
        }
    }
}