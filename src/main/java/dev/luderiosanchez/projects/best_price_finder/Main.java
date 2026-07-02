package dev.luderiosanchez.projects.best_price_finder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {

        List<String> sites = Arrays.asList("philippineairlines.com", "panam.com", "deltaairlines.com", "cebupac.com");
        sites.forEach(site -> new Website(site).getQuoteAsync().thenAccept(System.out::println));

        try {
            Thread.sleep(5000);
            System.out.println("Retrieved all quotes in " + (int) Website.getTotalTime() + " msec");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
