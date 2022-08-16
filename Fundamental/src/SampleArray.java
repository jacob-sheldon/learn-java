public class SampleArray {
    public static void main(String[] args) {
        double[] dList = {1.0, 2.0, 3.0, 4.0};
        for (int i = 0; i < dList.length; i++) {
            System.out.println(dList[i]);
        }

        double sum = 0.0d;
        for (double item : dList) {
            sum += item;
        }
        System.out.println(sum);
    }
}
