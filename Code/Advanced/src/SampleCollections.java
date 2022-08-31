import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class SampleCollections {
    public static void main(String[] args) {
        sampleAlgorithm();
    }

    static void sampleAlgorithm() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(3);
        ll.add(10);
        ll.add(33);
        ll.add(-100);
        System.out.println(ll);
        Comparator<Integer> r = Collections.reverseOrder();
        ll.sort(r);
        System.out.println(ll);

        for (Integer integer : ll) {
            System.out.print(integer + " ");
        }
        System.out.println();
        Collections.shuffle(ll);

        for (Integer integer : ll) {
            System.out.print(integer + " ");
        }
        System.out.println();

        System.out.println(Collections.min(ll));
        System.out.println(Collections.max(ll));
    }
}
