// 81. Write a Java program to create a shallow copy of a HashMap instance.
import java.util.*;
public class Shallow_Copy_Map {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        
        // Creating the original HashMap and adding elements
        HashMap<String, Integer> originalMap = new HashMap<String, Integer>();
        originalMap.put("Apple", 1);
        originalMap.put("Banana", 2);
        originalMap.put("Orange", 3);
        
        System.out.println("Original HashMap: " + originalMap);
        
        // Creating a shallow copy of the original map
        HashMap<String, Integer> shallowCopyMap = new HashMap<String, Integer>(originalMap);
        
        System.out.println("Shallow Copied HashMap: " + shallowCopyMap);
    }
}