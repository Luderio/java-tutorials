package dev.luderiosanchez.exercises.demo;

import java.util.ArrayList;

public class ListUtils {
    public static <T> void printAll(ArrayList<T> list) {
        for (T item: list) {
            System.out.println(item);
        }
    }
}
