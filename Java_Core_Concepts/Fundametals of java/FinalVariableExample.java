//wap for final variable
public class FinalVariableExample {
    final int finalVariable = 10; // Final variable

    public void display() {
        System.out.println("Final Variable: " + finalVariable);
    }

    public static void main(String[] args) {
        FinalVariableExample example = new FinalVariableExample();
        example.display();
        
        // Uncommenting the next line will cause a compilation error
        // example.finalVariable = 20; // Cannot change the value of a final variable
    }
}