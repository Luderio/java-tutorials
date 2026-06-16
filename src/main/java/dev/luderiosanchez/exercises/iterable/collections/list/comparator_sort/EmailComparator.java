package dev.luderiosanchez.exercises.iterable.collections.list.comparator_sort;

import java.util.Comparator;

public class EmailComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer obj1, Customer obj2) {
        return obj1.getEmail().compareTo(obj2.getEmail());
    }
}
