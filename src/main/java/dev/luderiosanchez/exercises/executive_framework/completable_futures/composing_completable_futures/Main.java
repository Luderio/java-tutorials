package dev.luderiosanchez.exercises.executive_framework.completable_futures.composing_completable_futures;

public class Main {
    public static void main(String[] args) {
        CompletableFuturesDemo.show();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
