// 80. Write a Java program to check if a map is empty or contains key-value mappings.
import java.util.*;
public class Check_Empty_Map {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        // Check if the map is empty
        if (map.isEmpty()) {
            System.out.println("The map is empty.");
        } else {
            System.out.println("The map contains key-value mappings: " + map);
        }
        
        // Adding an element to the map
        map.put("Apple", 1);
        
        // Check again if the map is empty
        if (map.isEmpty()) {
            System.out.println("The map is empty.");
        } else {
            System.out.println("The map contains key-value mappings: " + map);
        }
    }
}