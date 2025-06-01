// 55. Write a Java program for trimming the capacity of an array list.
import java.util.*;
public class Trim_Capacity_Array {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        ArrayList<String> list = new ArrayList<String>(10); // Initial capacity of 10
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("Original Array List: " + list);
        System.out.println("Original Capacity: " + list.size());

        // Trimming the capacity of the array list
        ((ArrayList<String>)list).trimToSize();

        System.out.println("Array List after trimming capacity: " + list);
        System.out.println("New Capacity: " + list.size());
    }
}