// 78. Write a Java program to copy all mappings from one map to another.
import java.util.*;
public class Copy_Map {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        
        // Creating the original HashMap and adding elements
        HashMap<String, Integer> originalMap = new HashMap<String, Integer>();
        originalMap.put("Apple", 1);
        originalMap.put("Banana", 2);
        originalMap.put("Orange", 3);
        
        System.out.println("Original HashMap: " + originalMap);
        
        // Copying all mappings from the original map to a new map
        HashMap<String, Integer> copiedMap = new HashMap<String, Integer>(originalMap);
        
        System.out.println("Copied HashMap: " + copiedMap);
    }
}