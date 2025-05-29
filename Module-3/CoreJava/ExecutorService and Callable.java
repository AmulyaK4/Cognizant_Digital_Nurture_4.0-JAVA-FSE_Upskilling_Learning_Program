import java.util.concurrent.*;
import java.util.*;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Callable<String> task1 = () -> "Task 1 result";
        Callable<String> task2 = () -> "Task 2 result";
        Callable<String> task3 = () -> "Task 3 result";

        List<Future<String>> results = executor.invokeAll(List.of(task1, task2, task3));

        for (Future<String> result : results) {
            System.out.println(result.get());
        }

        executor.shutdown();
    }
}
