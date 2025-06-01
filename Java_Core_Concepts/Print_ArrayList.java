// 58. Write a Java program to print all the elements of an ArrayList using the elements' position.
import java.util.*;
public class Print_ArrayList {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");

        // Printing all elements using their position
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at position " + i + ": " + list.get(i));
        }
    }
}