// WAP for Abstract method
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

public class AbstractMethodExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
    }
}
