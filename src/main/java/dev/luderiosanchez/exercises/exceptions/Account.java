package dev.luderiosanchez.exercises.exceptions;

import java.io.IOException;

public class Account {

    private float balance;

    public void deposit(float value) throws AccountException {
        if (value <= 0) {
            throw new AccountException(new InsufficientFundsException("Error: Deposits to the amount of: " + value + " is not allowed."));
        }
        else {
            setBalance(value);
        }
    }

    public void withdraw(float value) throws AccountException {
        if (value > balance) {
            throw new AccountException(new InsufficientFundsException("Insufficient Funds: You only have: " + balance + " balance in your account."));
        }
    }

    public float getBalance() {
        return balance;
    }

    private void setBalance(float balance) {
        this.balance = balance;
    }
}
