// WAP for String Manipulation
public class StringManipulationExample {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Original String: " + str);

        // Convert to uppercase
        String upper = str.toUpperCase();
        System.out.println("Uppercase: " + upper);

        // Replace a substring
        String replaced = str.replace("World", "Java");
        System.out.println("Replaced: " + replaced);

        // Split the string
        String[] words = str.split(" ");
        System.out.println("Split:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
