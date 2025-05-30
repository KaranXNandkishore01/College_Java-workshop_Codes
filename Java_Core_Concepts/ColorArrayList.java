// 46. Write a Java program to create an ArrayList, add some colors (as strings), and print the collection. 
import java.util.*;
public class ColorArrayList {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati, 0873AL231017(AIML)");
        
        // Create an ArrayList to hold colors
        List<String> colors = new ArrayList<>();
        
        // Adding colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        
        // Print the collection of colors
        System.out.println("Colors in the ArrayList: " + colors);
    }
}