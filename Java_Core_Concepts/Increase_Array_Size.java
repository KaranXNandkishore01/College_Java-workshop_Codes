// 56. Write a Java program to increase an array list size.
import java.util.*;
public class Increase_Array_Size {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        ArrayList<String> list = new ArrayList<String>(2); // Initial capacity of 2
        list.add("Apple");
        list.add("Banana");

        System.out.println("Original Array List: " + list);
        System.out.println("Original Capacity: " + list.size());

        // Increasing the size of the array list
        list.ensureCapacity(5); // Ensuring capacity for 5 elements

        list.add("Orange");
        list.add("Mango");
        list.add("Grapes");

        System.out.println("Array List after increasing size: " + list);
        System.out.println("New Capacity: " + list.size());
    }
}