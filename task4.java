import java.util.Arrays;
import java.util.List;

public class task4 {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
        Long count=strList.stream().filter(e->e.isEmpty()).count();
        System.out.printf("List %s has %d empty strings %n", strList, count);
	}
    }

