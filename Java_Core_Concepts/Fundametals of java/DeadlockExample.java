//WAP for Deadlock Concept
class ThreadA extends Thread {
    private final Object lock1;
    private final Object lock2;

    public ThreadA(Object lock1, Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    public void run() {
        synchronized (lock1) {
            System.out.println("Thread A: Holding lock 1...");
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            System.out.println("Thread A: Waiting for lock 2...");
            synchronized (lock2) {
                System.out.println("Thread A: Acquired lock 2!");
            }
        }
    }
}

class ThreadB extends Thread {
    private final Object lock1;
    private final Object lock2;

    public ThreadB(Object lock1, Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    public void run() {
        synchronized (lock2) {
            System.out.println("Thread B: Holding lock 2...");
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            System.out.println("Thread B: Waiting for lock 1...");
            synchronized (lock1) {
                System.out.println("Thread B: Acquired lock 1!");
            }
        }
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        ThreadA threadA = new ThreadA(lock1, lock2);
        ThreadB threadB = new ThreadB(lock1, lock2);

        threadA.start();
        threadB.start();
    }
}
