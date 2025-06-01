// WAP for final method
class Parent {
    final void display() {
        System.out.println("Final method in Parent class.");
    }
}

class Child extends Parent {
    // Cannot override final method; no display() method here
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();  // This will call the display() method from Parent
    }
}
