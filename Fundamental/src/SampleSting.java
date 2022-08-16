public class SampleSting {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'd'};
        String str = new String(charArray);
        String str2 = "1234";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str + str2);
        System.out.println(str.concat(str2));

        String str3 = String.format("I am %s, my age is %d, my weight is %f", "jacob", 31, 75.25);
        System.out.println(str3);
    }
}
