public class SampleInnerClass {
    public static void main(String[] args) {

    }
}

interface IClass {

}

class Outer_Class {
    class Inner_Class {

    }

    static class Static_Inner_Class {

    }

    void outerMethod() {
        class Method_Inner_Class {

        }
    }

    void outerAnonymousMethod() {
        IClass ic = new IClass() {

        };
    }

    void receiveAnonymousClass(IClass obj) {

    }

    void callAnonymousMethod() {
        receiveAnonymousClass(new IClass() {
        });
    }
}
