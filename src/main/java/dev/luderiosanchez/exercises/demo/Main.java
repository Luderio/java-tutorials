package dev.luderiosanchez.exercises.demo;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> names = new MyArrayList<>();
        names.add("Volvo");
        names.add("BMW");
        names.add("Ford");
        names.add("Mazda");

        ListUtils.printAll(names);



        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("BMW");

        System.out.println(cars);
    }
}
