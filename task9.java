import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class task9 {
    public static void main(String[] args) {
        List<String> l=Arrays.asList(
            "USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada"
        );
        String lupper=l.stream().map(x->x.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println(lupper);
    }
}
