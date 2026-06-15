package dev.luderiosanchez.exercises.iterable;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        GenericList<String> list = new GenericList<>(3);
        list.add("Luderio");
        list.add("Ian");
        list.add("Hero");
        Utils.printUsers(list);

        System.out.println("\n\n");

        for (var item: list) {
            System.out.println(item);
        }

        System.out.println("\n\n");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            var current = iterator.next();
            System.out.println(current);
        }
    }
}
