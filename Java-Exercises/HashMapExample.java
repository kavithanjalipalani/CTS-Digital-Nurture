import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer,String> students =
                new HashMap<>();

        students.put(101, "Kavi");
        students.put(102, "Anjali");
        students.put(103, "Priya");

        System.out.print("Enter Student ID: ");

        int id = sc.nextInt();

        System.out.println(
                students.getOrDefault(id,
                        "Student Not Found"));

        sc.close();
    }
}
