import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionExample {

    public static void main(String[] args) {

        List<String> names =
                new ArrayList<>();

        names.add("Zara");
        names.add("Kavi");
        names.add("Anjali");

        Collections.sort(names,
                (a, b) -> a.compareTo(b));

        System.out.println(names);
    }
}