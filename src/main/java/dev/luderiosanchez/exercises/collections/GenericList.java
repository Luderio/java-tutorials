package dev.luderiosanchez.exercises.collections;

import java.util.Iterator;

public class GenericList<Type> implements Iterable<Type>{
    private Object[] items;
    private int count;

    public GenericList(int size) {
        this.items = new Object[size];
    }

    public GenericList() {

    }

    public void add(Type item) {
        items[count++] = item;
    }

    @SuppressWarnings("unchecked")
    public Type get(int index) {
        return (Type) items[index];
    }

    public int getCount() {
        return count;
    }

    @Override
    public Iterator<Type> iterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<Type> {
        private GenericList<Type> list;
        private int index;

        public ListIterator(GenericList<Type> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (index < list.count);
        }
        @SuppressWarnings("unchecked")
        @Override
        public Type next() {
            return (Type) list.items[index++];
        }
    }
}
