interface MyInterface {
     void run();
     int age = 10;
    static void shout() {
        System.out.println("Animal shout");
    }

    default void eat() {
        System.out.println("Animal Eat");
    }
}

class InterfaceDog implements MyInterface {
     @Override
     public void run() {
         System.out.println("Dog run");
     }
 }

public class SampleInterface {
    public static void main(String[] args) {
        MyInterface.shout();
        InterfaceDog d = new InterfaceDog();
        d.eat();
        d.run();
    }
}
