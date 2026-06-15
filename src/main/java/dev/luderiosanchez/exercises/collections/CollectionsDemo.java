package dev.luderiosanchez.exercises.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        Collections.addAll(collection, "a", "b");
        System.out.println(collection);
        collection.remove("a");
        System.out.println(collection);
    }
}
