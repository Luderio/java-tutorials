package dev.luderiosanchez.exercises.executive_framework.completable_futures.transforming_a_completable_future;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {
    public static double toFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static void show() {
        CompletableFuture<Integer> temperature = CompletableFuture.supplyAsync(() -> 20);
        temperature.thenApply(CompletableFuturesDemo::toFahrenheit).thenAccept(System.out::println);
    }
}
