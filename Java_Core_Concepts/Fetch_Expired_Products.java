// 93) Display only Expired product details? select * from prod_dtls where exp<sysdate;
import java.util.*;
public class Fetch_Expired_Products {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");

        // Create a list of product details with their expiration dates
        List<String> products = new ArrayList<>();
        products.add("Product 1: Milk - Expired on 2023-01-01");
        products.add("Product 2: Bread - Expired on 2024-05-15");
        products.add("Product 3: Cheese - Expired on 2022-12-31");
        products.add("Product 4: Yogurt - Expired on 2024-06-20");
        products.add("Product 5: Butter - Expired on 2023-11-30");

        // Display only expired product details
        System.out.println("Expired Product Details:");
        for (String product : products) {
            if (product.contains("Expired")) {
                System.out.println(product);
            }
        }
    }
}