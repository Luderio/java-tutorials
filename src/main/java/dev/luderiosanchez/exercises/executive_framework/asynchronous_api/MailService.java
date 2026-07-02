package dev.luderiosanchez.exercises.executive_framework.asynchronous_api;

import dev.luderiosanchez.exercises.executive_framework.callables_and_futures.LongTask;

import java.util.concurrent.CompletableFuture;

public class MailService {
    public void send() {
        LongTask.simulate();
        System.out.println("Mail was sent");
    }

    public CompletableFuture<Void> sendAsync() {
        return CompletableFuture.runAsync(this::send);
    }
}
