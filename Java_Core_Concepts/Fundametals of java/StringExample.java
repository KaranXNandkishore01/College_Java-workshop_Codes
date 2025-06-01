// wap for Stringexample
public class StringExample {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Print the original string
        System.out.println("Original String: " + str);
        
        // Convert to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase: " + upperStr);
        
        // Convert to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase: " + lowerStr);
        
        // Find the length of the string
        int length = str.length();
        System.out.println("Length: " + length);
        
        // Replace a character
        String replacedStr = str.replace('o', '0');
        System.out.println("Replaced 'o' with '0': " + replacedStr);
        
        // Check if the string contains a substring
        boolean containsWorld = str.contains("World");
        System.out.println("Contains 'World': " + containsWorld);
    }
} 

