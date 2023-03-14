import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class task6 {
    public static void main(String[] args) {
        List<String>  city =Arrays.asList("pune","hubli","goa","bengalore","vijayapur");
        Predicate <String> p=(str)->str.startsWith("b");
        filter(city,p);
        }

    private static void filter(List<String> c, Predicate<String> p) {

        c.stream()
        .filter((city)->(p.test(city)))
        .forEach((city)->{
System.out.println(city);
        });
    }
}
