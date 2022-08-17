import java.lang.management.ThreadInfo;

class TreadInterface implements Runnable {
    final private String threadName;
    private Thread t;

    TreadInterface(String name) {
        threadName = name;
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

class ThreadClass extends Thread {
    final private String threadName;
    Thread t;

    ThreadClass(String name) {
        threadName = name;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class SampleThreading {
    public static void main(String[] args) {
//        runInterfaceThread();
        runClassThread();
    }

    static void runInterfaceThread() {
        TreadInterface ti1 = new TreadInterface("interface-thread-1");
        ti1.start();

        TreadInterface ti2 = new TreadInterface("interface-thread-2");
        ti2.start();
    }

    static void runClassThread() {
        ThreadClass tc1 = new ThreadClass("class-thread-1");
        tc1.start();

        ThreadClass tc2 = new ThreadClass("class-thread-2");
        tc2.start();
    }
}
