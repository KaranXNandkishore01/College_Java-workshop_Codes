// 49. Write a Java program to retrieve an element at a specified index from a given ArrayList. 
import java.util.*;
public class RetrieveElementArrayList {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati, 0873AL231017(AIML)");
        
        // Create an ArrayList and add some elements
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        items.add("Date");
        
        // Specify the index to retrieve
        int indexToRetrieve = 2; // Example: retrieving the element at index 2
        
        // Check if the index is valid
        if (indexToRetrieve >= 0 && indexToRetrieve < items.size()) {
            String retrievedItem = items.get(indexToRetrieve);
            System.out.println("Element at index " + indexToRetrieve + ": " + retrievedItem);
        } else {
            System.out.println("Index " + indexToRetrieve + " is out of bounds for the ArrayList.");
        }
    }
}