// 48. Write a Java program to insert an element into the ArrayList at the first position. 
import java.util.*;
public class InsertElementArrayList {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati, 0873AL231017(AIML)");
        
        // Create an ArrayList and add some elements
        List<String> items = new ArrayList<>();
        items.add("Banana");
        items.add("Cherry");
        items.add("Date");
        
        // Print the original ArrayList
        System.out.println("Original ArrayList: " + items);
        
        // Insert an element at the first position
        items.add(0, "Apple");
        
        // Print the updated ArrayList
        System.out.println("ArrayList after inserting 'Apple' at the first position: " + items);
    }
}