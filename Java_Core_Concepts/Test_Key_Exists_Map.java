// 82. Write a Java program to test whether a specified key exists in the map.
import java.util.*;
public class Test_Key_Exists_Map {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        
        // Creating a HashMap and adding key-value pairs
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        
        // Specified key to check
        String keyToCheck = "Banana";
        
        // Check if the specified key exists in the map
        if (map.containsKey(keyToCheck)) {
            System.out.println("The key '" + keyToCheck + "' exists in the map with value: " + map.get(keyToCheck));
        } else {
            System.out.println("The key '" + keyToCheck + "' does not exist in the map.");
        }
    }
}