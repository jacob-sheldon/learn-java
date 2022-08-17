public class SampleGenerics<T> {
    private T t;

    void setT(T t) {
        this.t = t;
    }

    T getT() {
        return t;
    }

    <B extends Comparable<B>> B maximum(B a, B b) {
        if (a.compareTo(b) > 0) {
            return a;
        }
        return b;
    }
    public static void main(String[] args) {
        SampleGenerics<Integer> g = new SampleGenerics<Integer>();
        g.setT(10);
        System.out.println(g.getT());
        System.out.println(g.maximum(10, 20));
    }


}
