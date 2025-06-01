// 91) Display customer names and mobile numbers from the city 'Texas'? select cname, mobile from cust_dtls where city='Texas';
import java.util.*;
public class Fetch_Customers_Texas {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");

        // Create a list of customer details
        List<String> customers = new ArrayList<>();
        customers.add("Customer 1: John Doe - Texas - 1234567890");
        customers.add("Customer 2: Jane Smith - California - 0987654321");
        customers.add("Customer 3: Alice Johnson - Texas - 1122334455");
        customers.add("Customer 4: Bob Brown - New York - 5566778899");
        customers.add("Customer 5: Charlie White - Texas - 6677889900");

        // Display customer names and mobile numbers from the city 'Texas'
        System.out.println("Customers from Texas:");
        for (String customer : customers) {
            if (customer.contains("Texas")) {
                String[] details = customer.split(" - ");
                System.out.println("Name: " + details[0] + ", Mobile: " + details[2]);
            }
        }
    }
}