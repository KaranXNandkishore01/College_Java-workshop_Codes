// 64. Write a Java program to insert elements at the first and last positions of a linked list.
import java.util.*;
public class Insert_First_Last_LinkedList {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        LinkedList<String> linkedList = new LinkedList<String>();
        
        // Adding initial elements to the linked list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        
        System.out.println("Original Linked List: " + linkedList);
        
        // Inserting an element at the first position
        linkedList.addFirst("Grapes");
        
        // Inserting an element at the last position
        linkedList.addLast("Mango");
        
        System.out.println("Linked List after inserting 'Grapes' at the first position and 'Mango' at the last position: " + linkedList);
    }
}