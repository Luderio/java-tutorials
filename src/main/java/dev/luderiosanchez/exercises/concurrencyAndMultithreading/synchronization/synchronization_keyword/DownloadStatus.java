package dev.luderiosanchez.exercises.concurrencyAndMultithreading.synchronization.synchronization_keyword;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private int totalBytes;
    private final Object incrementTotalBytesLock = new Object(); // monitor object used to provide unique object id.

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
        // using the synchronized keyword with a monitor object.
        synchronized (incrementTotalBytesLock) {
            totalBytes++;
        }
    }

}
