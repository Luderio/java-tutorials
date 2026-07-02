package dev.luderiosanchez.projects.best_price_finder;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LocalTime start = LocalTime.now();
        List<String> sites = Arrays.asList("philippineairlines.com", "panam.com", "deltaairlines.com", "cebupac.com");
        sites.forEach(site -> new FlightService(site).getQuoteAsync().thenAccept(System.out::println));
        LocalTime end = LocalTime.now();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        var duration = Duration.between(start, end);
        System.out.println("Retrieved all quotes in " + duration.toMillis() + " msec");
    }
}
