package executorService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        try (ExecutorService executorService = Executors.newFixedThreadPool(3);) {

            Callable<String> task1 = () -> {
                Thread.sleep(1000);
                return "Result of Task 1";
            };

            Callable<String> task2 = () -> {
                Thread.sleep(1000);
                return "Result of Task 2";
            };

            Callable<String> task3 = () -> {
                Thread.sleep(1000);
                return "Result of Task 3";
            };

            Future<String> result1 = executorService.submit(task1);
            Future<String> result2 = executorService.submit(task2);
            Future<String> result3 = executorService.submit(task3);

            List<Future<String>> list = new ArrayList<>(Arrays.asList(result1, result2, result3));
            for (Future<String> l : list) {
                System.out.println(l.get());
            }
        }
    }
}
