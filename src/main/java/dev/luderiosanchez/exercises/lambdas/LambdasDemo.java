package dev.luderiosanchez.exercises.lambdas;

import java.util.List;
import java.util.function.*;

public class LambdasDemo {
    public static void show() {
        BinaryOperator<Integer> add = (a, b) -> a + b;;
        Function<Integer, Integer> squared = x -> x * x;

        var result = add.andThen(squared).apply(2, 5);
        System.out.println(result);
    }


}
