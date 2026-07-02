package dev.luderiosanchez.exercises.executive_framework.completable_futures.creating_a_completable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class CompletableFuturesDemo {
    public static void show() {
        // A CompletableFuture that returns void
        Runnable task1 = () -> System.out.println("Task 1");
        var future1 = CompletableFuture.runAsync(task1);
        System.out.println(future1);

        // A CompletableFuture that returns a value
        Supplier<Integer> task2 = () -> {
            return 1;
        };
        var future2 = CompletableFuture.supplyAsync(task2);
        try {
            var result = future2.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
