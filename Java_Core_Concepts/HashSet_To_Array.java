// 72. Write a Java program to convert a HashSet into an array.
import java.util.*;
public class HashSet_To_Array {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        
        // Creating a HashSet and adding elements
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        
        System.out.println("Original HashSet: " + hashSet);
        
        // Converting the HashSet to an array
        String[] array = hashSet.toArray(new String[0]);
        
        System.out.println("Converted Array: " + Arrays.toString(array));
    }
}