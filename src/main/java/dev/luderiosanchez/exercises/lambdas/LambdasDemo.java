package dev.luderiosanchez.exercises.lambdas;

import java.util.List;
import java.util.function.Consumer;

public class LambdasDemo {
    public static void show() {
        List<String> list = List.of("Chezzy", "Ian", "Hero");

        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
        list.forEach(print.andThen(printUpperCase).andThen(print));

    }


}
