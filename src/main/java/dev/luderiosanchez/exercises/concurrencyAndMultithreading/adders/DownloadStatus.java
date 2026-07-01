package dev.luderiosanchez.exercises.concurrencyAndMultithreading.adders;


import java.util.concurrent.atomic.LongAdder;

public class DownloadStatus {
    private final LongAdder totalBytes = new LongAdder();
    public int getTotalBytes() {
        return totalBytes.intValue();
    }
    public void incrementTotalBytes() {
        totalBytes.increment();
    }

}
