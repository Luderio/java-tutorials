package dev.luderiosanchez.exercises.executive_framework.callables_and_futures;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
    public static void show() {
        try (ExecutorService executor = Executors.newFixedThreadPool(2)) {
            /*
            - An executor.submit() with a lambda function similar to the Callable interface.
            - Returns a Future<Integer> type. a value that will execute in the future and not immediately.
            - the .submit() method will hand of the specified tasks to a separate worker thread, and will free up the main thread tp work on other stuff.
            - future.get() will get the returned value from the worker thread.
            - If the worker thread is not yet done with the task, the main thread will be blocked until the worker thread is finished doing the task.
            */
            var future = executor.submit(() -> {
                LongTask.simulate();
                return 1;
            });
            System.out.println("Do more work");
            var result = future.get();
            System.out.println(result);
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
