// 88) Display product details manufactured in the current year only?
import java.util.*;

public class Fetch_Current_Year_Products {
    public static void main(String[] args) {
        System.out.println("Karan Prajapati,0873AL231017(AIML)");

        // Create a list of products with their manufacturing years
        List<String> products = new ArrayList<>();
        products.add("Product 1: Laptop - 2024");
        products.add("Product 2: Smartphone - 2023");
        products.add("Product 3: Tablet - 2024");
        products.add("Product 4: Monitor - 2022");
        products.add("Product 5: Keyboard - 2024");

        // Display all products manufactured in the current year (2024)
        System.out.println("Products manufactured in the current year (2024):");
        for (String product : products) {
            if (product.contains("2024")) {
                System.out.println(product);
            }
        }
    }
}
