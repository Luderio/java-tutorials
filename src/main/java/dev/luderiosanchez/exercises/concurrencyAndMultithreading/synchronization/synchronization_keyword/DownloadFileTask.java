package dev.luderiosanchez.exercises.concurrencyAndMultithreading.synchronization.synchronization_keyword;

public class DownloadFileTask implements Runnable {
    private final String fileName;
    private final DownloadStatus status;


    public DownloadFileTask(String fileName, DownloadStatus status) {
        this.fileName = fileName;
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading " + fileName + " on: " + Thread.currentThread().getName());

        for (int i = 0; i < 10_000; i++) {

            if(Thread.currentThread().isInterrupted()) return;
            status.incrementTotalBytes();
        }

        System.out.println("Download complete: " + Thread.currentThread().getName());
    }

    public DownloadStatus getStatus() {
        return status;
    }
}
