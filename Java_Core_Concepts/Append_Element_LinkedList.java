// 59. Write a Java program to append a specified element to the end of a linked list.
import java.util.*;
public class Append_Element_LinkedList {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        LinkedList<String> linkedList = new LinkedList<String>();
        
        // Adding initial elements to the linked list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        
        System.out.println("Original Linked List: " + linkedList);
        
        // Appending a specified element to the end of the linked list
        linkedList.add("Grapes");
        
        System.out.println("Linked List after appending 'Grapes': " + linkedList);
    }
}