package dev.luderiosanchez.exercises;

public class DownloadFileTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Downloading a file on Thread: " + Thread.currentThread().getName());

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if(Thread.currentThread().isInterrupted()) {
                return;
            }

            System.out.println("Downloading byte " + i);
        }

        System.out.println("Download complete: " + Thread.currentThread().getName());
    }
}
