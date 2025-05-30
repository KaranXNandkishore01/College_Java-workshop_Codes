// 50. Write a Java program to update an ArrayList element by a given element. 
import java.util.*;
public class UpdateElementArrayList {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati, 0873AL231017(AIML)");
        
        // Create an ArrayList and add some elements
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        
        // Print the original ArrayList
        System.out.println("Original ArrayList: " + items);
        
        // Specify the element to update and the new value
        String oldElement = "Banana";
        String newElement = "Mango";
        
        // Update the element if it exists in the ArrayList
        int index = items.indexOf(oldElement);
        if (index != -1) {
            items.set(index, newElement);
            System.out.println("ArrayList after updating '" + oldElement + "' to '" + newElement + "': " + items);
        } else {
            System.out.println("'" + oldElement + "' not found in the ArrayList.");
        }
    }
}