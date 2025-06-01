// 86) WAP in java to Fetch all clerks information
import java.util.*;
public class Fetch_Clerks_Info {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        
        // Create a list of clerks
        List<String> clerks = new ArrayList<>();
        clerks.add("Clerk 1: John Doe");
        clerks.add("Clerk 2: Jane Smith");
        clerks.add("Clerk 3: Alice Johnson");
        
        // Fetch and display all clerks' information
        System.out.println("Fetching all clerks' information:");
        for (String clerk : clerks) {
            System.out.println(clerk);
        }
    }
}