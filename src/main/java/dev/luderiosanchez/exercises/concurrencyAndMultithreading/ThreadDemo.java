package dev.luderiosanchez.exercises.concurrencyAndMultithreading;

import dev.luderiosanchez.exercises.DownloadFileTask;

public class ThreadDemo {
    public static void  show() {
        System.out.println("current thread: " + Thread.currentThread().getName());

        Thread thread = new Thread(new DownloadFileTask());
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread.interrupt();
        System.out.println("File is ready to be scanned.");
    }
}
