// 51. Write a Java program to join two array lists.
import java.util.*;

public class Two_Array {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Apple");
        list1.add("Banana");

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Orange");
        list2.add("Grapes");

        // Joining two array lists
        ArrayList<String> joinedList = new ArrayList<String>(list1);
        joinedList.addAll(list2);

        System.out.println("Joined Array List: " + joinedList);
    }
}