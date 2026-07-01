package dev.luderiosanchez.exercises.concurrencyAndMultithreading.atomic_objects;

import dev.luderiosanchez.exercises.concurrencyAndMultithreading.synchronization.DownloadFileTask;
import dev.luderiosanchez.exercises.concurrencyAndMultithreading.synchronization.DownloadStatus;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void  show() {

        List<Thread> threads = new ArrayList<>();
        var status = new DownloadStatus();

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask("File " + i, status));
            thread.start();
            threads.add(thread);

        }

        for(var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw  new RuntimeException(e);
            }
        }


        System.out.println(status.getTotalBytes());
    }
}