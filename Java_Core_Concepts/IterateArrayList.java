// 47. Write a Java program to iterate through all elements in an ArrayList. 
import java.util.*;
public class IterateArrayList {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati, 0873AL231017(AIML)");
        
        // Create an ArrayList and add some elements
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        items.add("Date");
        items.add("Elderberry");
        
        // Iterate through all elements in the ArrayList using a for-each loop
        System.out.println("Items in the ArrayList:");
        for (String item : items) {
            System.out.println(item);
        }
        
        // Alternatively, iterate using an iterator
        System.out.println("\nIterating using an iterator:");
        Iterator<String> iterator = items.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}