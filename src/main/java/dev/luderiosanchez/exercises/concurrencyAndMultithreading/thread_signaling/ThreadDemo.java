package dev.luderiosanchez.exercises.concurrencyAndMultithreading.thread_signaling;

public class ThreadDemo {
    public static void  show() {

       var status = new DownloadStatus();

       var thread1 = new Thread(new DownloadFileTask("File 1", status));
       var thread2 = new Thread(() -> {
           while (!status.isDone()) {
               synchronized (status) {
                   try {
                       status.wait();
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
           }
           System.out.println(status.getTotalBytes());
       });

       thread1.start();
       thread2.start();
    }
}
