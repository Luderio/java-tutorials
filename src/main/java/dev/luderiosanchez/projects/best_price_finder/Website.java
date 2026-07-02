package dev.luderiosanchez.projects.best_price_finder;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class Website {
    private final String siteName;
    private final double ticketPrice;
    private static double totalTime;

    public Website(String siteName) {
        this.siteName = siteName;
        this.ticketPrice = randomNumber(500, 900);
    }

    @Override
    public String toString() {
        String price = NumberFormat.getCurrencyInstance(Locale.of("en","PH")).format(ticketPrice);
        return "Quote{" +
                "site='" + siteName + '\'' +
                ", price=" + price +
                '}';
    }

    private int randomNumber(int min, int max) {
        return (int)(Math.random() * (max -  min + 1)) + min;
    }

    public CompletableFuture<String> getQuoteAsync() {
        long start = System.currentTimeMillis();
        System.out.println("Getting a quote from " + siteName);

        return CompletableFuture.supplyAsync(() -> {
            try {
                int time = randomNumber(1000, 4000);
                Thread.sleep(time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            long end = System.currentTimeMillis();
            totalTime = (end - start);
            return toString();
        });

    }


    public static double getTotalTime() {
        return totalTime;
    }
}
