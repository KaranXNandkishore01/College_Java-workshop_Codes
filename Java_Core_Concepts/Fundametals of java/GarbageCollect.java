// Garbage collection
// Demonstration of Garbage Collection in Java
class GarbageCollectionExample {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector called for object: " + this);
    }
}

public class GarbageCollect {
    public static void main(String[] args) {
        // Creating objects
        GarbageCollectionExample obj1 = new GarbageCollectionExample();
        GarbageCollectionExample obj2 = new GarbageCollectionExample();

        // Nullifying references
        obj1 = null;
        obj2 = null;

        // Requesting garbage collection
        System.gc();

        System.out.println("Garbage collection requested.");
    }
}
