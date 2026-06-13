package dev.luderiosanchez.exercises.exceptions;

public class ExceptionsDemo {
    public static void show() {
        Account account = new Account();
        try {
            account.getBalance();
            account.deposit(50);
            account.withdraw(55);
        } catch (AccountException e) {
            System.out.println(e.getCause().getMessage());
        }
    }


}