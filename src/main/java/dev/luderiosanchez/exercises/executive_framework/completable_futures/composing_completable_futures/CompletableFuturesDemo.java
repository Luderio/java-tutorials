package dev.luderiosanchez.exercises.executive_framework.completable_futures.composing_completable_futures;

import java.util.*;
import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {

    public static CompletableFuture<String> getUserEmailAsync(int id) {
        Map<Integer, String> accounts = new HashMap<>();
        accounts.put(1, "luderio.rubis.sanchez@gmail.com");
        accounts.put(2, "chezzy.sanchez@gmail.com");
        return CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName()); // to show which thread the operation is running from
            return accounts.get(id).toLowerCase();
        });
    }

    public static CompletableFuture<String> getUserPlaylistAsync(String email) {
        Map<String, List<String>> playlists = new HashMap<>();
        playlists.put("luderio.rubis.sanchez@gmail.com", Arrays.asList("Poker Face by Lady Gaga", "Abracadabra by Lad Gaga"));
        playlists.put("chezzy.sanchez@gmail.com", Arrays.asList("Baby Shark by FinkFong", "Johnny, Johnny, Yes Papa"));

        return CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            return email + "'s playlist: " + playlists.get(email);
        } );
    }

    public static void show() {
        System.out.println(Thread.currentThread().getName()); // to show which thread the operation is running from
        getUserEmailAsync(2).thenCompose(CompletableFuturesDemo::getUserPlaylistAsync).thenAccept(System.out::println);
    }
}
