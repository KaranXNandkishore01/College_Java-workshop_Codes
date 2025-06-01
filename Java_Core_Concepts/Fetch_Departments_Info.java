// 87) Display all departments information located at CHICAGO?
import java.util.*;
public class Fetch_Departments_Info {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");
        
        // Create a list of departments located at CHICAGO
        List<String> departments = new ArrayList<>();
        departments.add("Department 1: Sales - Chicago");
        departments.add("Department 2: Marketing - Chicago");
        departments.add("Department 3: HR - Chicago");
        
        // Display all departments' information located at CHICAGO
        System.out.println("Departments located at CHICAGO:");
        for (String department : departments) {
            System.out.println(department);
        }
    }
}