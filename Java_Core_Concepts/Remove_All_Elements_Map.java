// 79. Write a Java program to remove all key-value pairs from a map.
import java.util.*;
public class Remove_All_Elements_Map {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        
        // Creating a HashMap and adding key-value pairs
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        
        System.out.println("Original Map: " + map);
        
        // Removing all key-value pairs from the map
        map.clear();
        
        System.out.println("Map after removing all key-value pairs: " + map);
    }
}