package dev.luderiosanchez.exercises.exceptions;

public class AccountException extends Exception {
    public AccountException() {
    }

    public AccountException(Exception cause) {
        super(cause);
    }
}
