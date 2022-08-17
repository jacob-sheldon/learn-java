class Chat {
    boolean flag = false;

    synchronized void Question(String msg) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(msg);
        flag = true;
        notify();
    }

    synchronized void Answer(String msg) {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(msg);
        flag = false;
        notify();
    }
}

class T1 implements Runnable {
    Chat m;
    String[] s1 = {"Hi", "How are you?", "I am also doing fine!"};

    T1(Chat m1) {
        this.m = m1;
        new Thread(this, "Question").start();
    }

    @Override
    public void run() { for (var s : s1) m.Question(s); }
}

class T2 extends Thread {
    Chat m;
    String[] s2 = {"Hi", "I am good, what about you?", "Great!"};

    T2(Chat m) {
        this.m = m;
        new Thread(this, "Answer").start();
    }

    @Override
    public void run() {
        super.run();
        for (var s : s2) m.Answer(s);
    }
}

public class SampleInterThreadCommunication {
    public static void main(String[] args) {
        Chat m = new Chat();
        new T1(m);
        new T2(m);
    }
}
