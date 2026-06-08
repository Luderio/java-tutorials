package dev.luderiosanchez.exercises.exceptions;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            ExceptionsDemo.show();
        } catch (Throwable e) {
            System.out.println("Depositing values less than or equal to 0 is not allowed.");
        }
    }
}
