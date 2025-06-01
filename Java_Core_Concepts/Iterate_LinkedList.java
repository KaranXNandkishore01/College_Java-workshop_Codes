// 60. Write a Java program to iterate through all elements in a linked list.
import java.util.*;
public class Iterate_LinkedList {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        LinkedList<String> linkedList = new LinkedList<String>();
        
        // Adding initial elements to the linked list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grapes");
        
        System.out.println("Original Linked List: " + linkedList);
        
        // Iterating through all elements in the linked list
        System.out.println("Iterating through the linked list:");
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}