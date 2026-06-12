package dev.luderiosanchez.exercises.generics;

public class Main {
    public static void main(String[] args) {
        GenericList<Integer> list = new GenericList<Integer>(10);
        list.add(1);
        list.get(0);
        int number = list.get(0);

    }
}
