package dev.luderiosanchez.exercises.lambdas;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdasDemo {
    public static void show() {
        Function<String, String> replaceColon = str -> str.replace(",", ": ");
        Function<String, String> addBraces = str -> "{ " + str + " }";

        var result = replaceColon.andThen(addBraces).apply("Name,Luderio Sanchez");
        System.out.println(result);
    }


}
