public class SamleObjectAndClass {
    int age;
    String name;
    SamleObjectAndClass(String n) {
        age = 10;
        name = n;
    }
    public static void main(String[] args) {
        SamleObjectAndClass obj = new SamleObjectAndClass("Tom");
        System.out.println(obj.age);
        System.out.println(obj.name);
    }
}
