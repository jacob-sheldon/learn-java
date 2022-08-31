import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SamplePatternExpression {
    public static void main(String[] args) {
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(line);
        System.out.println(m.groupCount());
        if (m.find()) {
            System.out.println(m.group(0));
            System.out.println(m.group(1));
            System.out.println(m.group(2));
        }
    }
}
