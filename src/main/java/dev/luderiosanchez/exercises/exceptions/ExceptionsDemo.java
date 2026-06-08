package dev.luderiosanchez.exercises.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {
    public static void show() throws IOException {
        Account account = new Account();
        try {
            account.deposit(-1);
        } catch (IOException e) {
            System.out.println("Error Occurred");
            throw e;
        }
    }


}