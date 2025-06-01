// 53. Write a Java program to empty an array list.
import java.util.*;
public class Empty_Array {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("Original Array List: " + list);

        // Emptying the array list
        list.clear();

        System.out.println("Array List after emptying: " + list);
    }
}