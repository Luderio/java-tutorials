package dev.luderiosanchez.exercises.demo;

import java.util.ArrayList;

public class MyArrayList<T> extends ArrayList<T> {
    public void printAll() {
        for (T item : this) {
            System.out.println(item);
        }
    }
}
