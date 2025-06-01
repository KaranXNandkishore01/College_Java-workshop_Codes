//WAP for String Builder
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        
        // Append a string
        sb.append(", World!");
        System.out.println("After append: " + sb);
        
        // Insert a string
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);
        
        // Delete a substring
        sb.delete(5, 10);
        System.out.println("After delete: " + sb);
        
        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
