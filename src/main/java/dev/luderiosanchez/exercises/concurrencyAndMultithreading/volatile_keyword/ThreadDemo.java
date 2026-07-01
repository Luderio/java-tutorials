package dev.luderiosanchez.exercises.concurrencyAndMultithreading.volatile_keyword;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void  show() {

       var status = new DownloadStatus();

       var thread1 = new Thread(new DownloadFileTask("File 1", status));
       var thread2 = new Thread(() -> {
           while (!status.isDone()) {}
           System.out.println(status.getTotalBytes());
       });

       thread1.start();
       thread2.start();
    }
}
