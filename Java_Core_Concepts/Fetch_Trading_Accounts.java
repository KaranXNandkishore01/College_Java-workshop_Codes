// 92) Get the information of Trading account?
import java.util.*;
public class Fetch_Trading_Accounts {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");

        // Create a list of account details
        List<String> accounts = new ArrayList<>();
        accounts.add("Account 1: John Doe - Trading Account - $3000");
        accounts.add("Account 2: Jane Smith - Savings Account - $5000");
        accounts.add("Account 3: Alice Johnson - Trading Account - $4000");
        accounts.add("Account 4: Bob Brown - Current Account - $2000");
        accounts.add("Account 5: Charlie White - Trading Account - $3500");

        // Display all trading account details
        System.out.println("Trading Account Details:");
        for (String account : accounts) {
            if (account.contains("Trading Account")) {
                System.out.println(account);
            }
        }
    }
}
