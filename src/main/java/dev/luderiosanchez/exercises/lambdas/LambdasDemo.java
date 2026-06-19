package dev.luderiosanchez.exercises.lambdas;

import java.util.List;
import java.util.function.*;

public class LambdasDemo {
    public static void show() {
       UnaryOperator<Integer> square = x -> x * x;
       UnaryOperator<Integer> increment = x -> x + 1;

        var result = increment.andThen(square).apply(1);
        System.out.println(result);
    }


}
