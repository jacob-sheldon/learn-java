public class SampleMethod {
    public static void main(String[] args) {
        System.out.println(minFunction(1, 2));
        System.out.println(minFunction(1.0, 2.0));
        System.out.println(sum(1, 2, 3, 4, 5));
    }

    static int minFunction(int a, int b) {
        return Math.min(a, b);
    }
    static int minFunction(double a, double b) {
        return (int)Math.min(a, b);
    }

    static int sum(int... items) {
        int sum = 0;
        for (int item : items) {
            sum += item;
        }
        return sum;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
