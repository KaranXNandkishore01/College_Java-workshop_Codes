// 62. Write a Java program to iterate a linked list in reverse order.
import java.util.*;
public class Iterate_LinkedList_Reverse {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        LinkedList<String> linkedList = new LinkedList<String>();
        
        // Adding initial elements to the linked list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grapes");
        
        System.out.println("Original Linked List: " + linkedList);
        
        // Iterating through the linked list in reverse order
        System.out.println("Iterating through the linked list in reverse order:");
        ListIterator<String> iterator = linkedList.listIterator(linkedList.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}