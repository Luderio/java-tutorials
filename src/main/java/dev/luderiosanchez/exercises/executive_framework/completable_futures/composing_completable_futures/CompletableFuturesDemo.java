package dev.luderiosanchez.exercises.executive_framework.completable_futures.composing_completable_futures;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {

    public static void show() {
        CompletableFuture.supplyAsync(() -> "luderio.rubis.sanchez@gmail.com")
                .thenCompose(email -> CompletableFuture.supplyAsync(() -> email + "'s Playlist"))
                .thenAccept(System.out::println);
    }
}
