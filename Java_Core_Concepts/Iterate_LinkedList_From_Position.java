// 61. Write a Java program to iterate through all elements starting from a specified position in a linked list.
import java.util.*;
public class Iterate_LinkedList_From_Position {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        LinkedList<String> linkedList = new LinkedList<String>();
        
        // Adding initial elements to the linked list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grapes");
        
        System.out.println("Original Linked List: " + linkedList);
        
        // Specified starting position
        int startPosition = 2; // Starting from the third element (index 2)
        
        // Iterating through all elements starting from the specified position
        System.out.println("Iterating through the linked list from position " + startPosition + ":");
        for (int i = startPosition; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}