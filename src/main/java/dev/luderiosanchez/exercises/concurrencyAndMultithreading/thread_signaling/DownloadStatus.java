package dev.luderiosanchez.exercises.concurrencyAndMultithreading.thread_signaling;

public class DownloadStatus {
    private int totalBytes;
    private final Object totalBytesLock = new Object();

    // used the volatile keyword to force the isDone field value change in the RAM of all CPU threads immediately making the changes visible on all threads.
    private volatile boolean isDone;

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
       synchronized (totalBytesLock) {
           totalBytes++;
       }
    }


    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }
}
