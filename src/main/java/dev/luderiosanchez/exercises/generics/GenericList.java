package dev.luderiosanchez.exercises.generics;

public class GenericList<Type> {
    private final Object[] items;
    private int count;

    public GenericList(int size) {
        this.items = new Object[size];
    }

    public void add(Type item) {
        items[count++] = item;
    }

    @SuppressWarnings("unchecked")
    public Type get(int index) {
        return (Type) items[index];
    }
}
