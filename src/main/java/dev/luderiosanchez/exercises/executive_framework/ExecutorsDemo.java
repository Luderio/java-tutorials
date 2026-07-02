package dev.luderiosanchez.exercises.executive_framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
    public static void show() {
        try (ExecutorService executor = Executors.newFixedThreadPool(2)) {
            // executor.submit with a lambda function with the same signature as the Runnable interface
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        }
    }
}
