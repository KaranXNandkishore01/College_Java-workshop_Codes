// 57. Write a Java program to replace the second element of an ArrayList with the specified element.
import java.util.*;
public class Replace_Second_Element {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("Original Array List: " + list);

        // Replacing the second element (index 1) with "Grapes"
        if (list.size() > 1) {
            list.set(1, "Grapes");
        }

        System.out.println("Array List after replacing second element: " + list);
    }
}