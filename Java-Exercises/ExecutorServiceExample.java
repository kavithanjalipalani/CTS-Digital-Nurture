import java.util.concurrent.*;

public class ExecutorServiceExample {

    public static void main(String[] args)
            throws Exception {

        ExecutorService executor =
                Executors.newFixedThreadPool(3);

        Callable<String> task =
                () -> "Task Completed";

        Future<String> future =
                executor.submit(task);

        System.out.println(
                future.get());

        executor.shutdown();
    }
}
