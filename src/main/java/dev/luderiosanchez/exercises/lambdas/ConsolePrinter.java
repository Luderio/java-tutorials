package dev.luderiosanchez.exercises.lambdas;

public class ConsolePrinter implements Printer{
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
