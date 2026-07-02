package dev.luderiosanchez.exercises.executive_framework.asynchronous_api;

public class Main {
    public static void main(String[] args) {
         MailService service = new MailService();
         service.sendAsync();
        System.out.println("Hello");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
