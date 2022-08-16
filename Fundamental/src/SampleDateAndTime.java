import java.util.Date;

public class SampleDateAndTime {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now.toString());

        Date d2 = new Date(231232432);
        System.out.println(d2.getTime());
        System.out.println(now.getTime());
        System.out.println(now.after(d2));
    }
}
