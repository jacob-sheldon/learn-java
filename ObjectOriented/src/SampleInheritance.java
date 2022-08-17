public class SampleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        Mammal m = d;
        InheritanceAnimal a = d;
    }
}

class InheritanceAnimal {
    int age;
    void walk() {

    }
}

class Mammal extends InheritanceAnimal {

}

class Head {
    Double size;
}

class Dog extends Mammal {
    private Head head;
    void bark() {
        System.out.printf("Dog bark");
    }

    public static void main(String[] args) {
        Mammal m = new Mammal();
        Dog d = new Dog();
        System.out.println(d instanceof Mammal);
    }
}
