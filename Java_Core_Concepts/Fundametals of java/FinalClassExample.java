//WAP for final Class
final class FinalClass {
    void display() {
        System.out.println("Final class method.");
    }
}

// The following class cannot extend FinalClass
// class SubClass extends FinalClass {
//     void display() {
//         System.out.println("SubClass method.");
//     }
// }

public class FinalClassExample {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
    }
}
