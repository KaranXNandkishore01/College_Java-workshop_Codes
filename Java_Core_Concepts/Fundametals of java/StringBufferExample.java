// WAP for String Buffer
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        
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
