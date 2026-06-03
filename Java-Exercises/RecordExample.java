import java.util.List;

record Person(String name, int age) {}

public class RecordExample {

    public static void main(String[] args) {

        List<Person> people =
                List.of(
                        new Person("Kavi",20),
                        new Person("Anjali",25),
                        new Person("Priya",17)
                );

        people.stream()
                .filter(p -> p.age() >= 18)
                .forEach(System.out::println);
    }
}