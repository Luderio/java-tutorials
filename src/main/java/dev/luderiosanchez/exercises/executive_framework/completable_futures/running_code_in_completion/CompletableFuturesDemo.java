package dev.luderiosanchez.exercises.executive_framework.completable_futures.running_code_in_completion;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {
    public static void show() {
       var future = CompletableFuture.supplyAsync(() -> Arrays.asList(1, 2, 3, 4, 5));
       future.thenAcceptAsync(result -> {
           System.out.println(Thread.currentThread().getName());
           System.out.println(result);
       });

    }
}
