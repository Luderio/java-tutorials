package dev.luderiosanchez.exercises.exceptions;

public class Account {

    private float balance;

    public void deposit(float value) throws AccountException {
        if (value <= 0) {
            throw new AccountException(new InsufficientFundsException("Deposit Failed: Deposits to the amount of: " + value + " is not allowed."));
        }
        else {
            setBalance(value);
            System.out.println("Fund Deposit Successful. Your current balance is now: " + this.balance + ".");
        }
    }

    public void withdraw(float value) throws AccountException {
        if (value > balance) {
            throw new AccountException(new InsufficientFundsException("Insufficient Funds: You only have: " + balance + " balance in your account."));
        }
        else {
            this.balance -= value;
            System.out.println("Funds withdrawn: " + value + ".\nRemaining balance is now: " + this.balance + ".");
        }
    }

    public void getBalance() {
        System.out.println("Your current balance is: " + balance + ".");
    }

    private void setBalance(float balance) {
        this.balance = balance;
    }
}
