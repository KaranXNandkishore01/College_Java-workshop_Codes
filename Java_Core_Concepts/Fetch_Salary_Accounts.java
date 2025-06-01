// 90) Get all SALARY account details?
import java.util.*;
public class Fetch_Salary_Accounts {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");

        // Create a list of account details
        List<String> accounts = new ArrayList<>();
        accounts.add("Account 1: John Doe - Salary Account - $3000");
        accounts.add("Account 2: Jane Smith - Savings Account - $5000");
        accounts.add("Account 3: Alice Johnson - Salary Account - $4000");
        accounts.add("Account 4: Bob Brown - Current Account - $2000");
        accounts.add("Account 5: Charlie White - Salary Account - $3500");

        // Display all salary account details
        System.out.println("Salary Account Details:");
        for (String account : accounts) {
            if (account.contains("Salary Account")) {
                System.out.println(account);
            }
        }
    }
}