import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class task7 {
    public static void main(String[] args) {
        List<String> l=Arrays.asList(
            "USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada"
        );
        Predicate<String> nameStartwithJ=(str)->str.startsWith("J");
        Predicate<String> lengthmorethen4=(str)->str.length()>4;
        Predicate<String> p=nameStartwithJ.and(lengthmorethen4);
        filter(l,p);
    }

    public static void filter(List<String> l, Predicate<String> p){
        l.stream().filter((e)->(p.test(e)))
        .forEach(e->System.out.println(e));
    }
}
