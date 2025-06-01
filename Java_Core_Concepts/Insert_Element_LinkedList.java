// 63. Write a Java program to insert a specified element at a given position in a linked list.
import java.util.*;
public class Insert_Element_LinkedList {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        LinkedList<String> linkedList = new LinkedList<String>();
        
        // Adding initial elements to the linked list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        
        System.out.println("Original Linked List: " + linkedList);
        
        // Specified element and position
        String elementToInsert = "Grapes";
        int position = 1; // Inserting at index 1 (second position)
        
        // Inserting the specified element at the given position
        linkedList.add(position, elementToInsert);
        
        System.out.println("Linked List after inserting '" + elementToInsert + "' at position " + position + ": " + linkedList);
    }
}