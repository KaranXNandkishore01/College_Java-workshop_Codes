// 89) Get the details of cutomers accounts who opened the accounts before this year?
import java.util.*;
public class Fetch_Customers_Before_Current_Year {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");

        // Create a list of customer accounts with their opening years
        List<String> customers = new ArrayList<>();
        customers.add("Customer 1: John Doe - 2022");
        customers.add("Customer 2: Jane Smith - 2023");
        customers.add("Customer 3: Alice Johnson - 2021");
        customers.add("Customer 4: Bob Brown - 2024");
        customers.add("Customer 5: Charlie White - 2020");

        // Display all customer accounts opened before the current year (2024)
        System.out.println("Customers who opened accounts before the current year (2024):");
        for (String customer : customers) {
            if (customer.contains("2022") || customer.contains("2021") || customer.contains("2020")) {
                System.out.println(customer);
            }
        }
    }
}