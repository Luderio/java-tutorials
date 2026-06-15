package dev.luderiosanchez.exercises.collections.comparator_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Ian", "ian.rusiana@gmail.com"));
        customers.add(new Customer("Chezzy", "chezzy.sanchez@gmail.com"));
        customers.add(new Customer("Hero", "hero.rusiana@gmail.com"));
        Collections.sort(customers, new EmailComparator());
        System.out.println(customers);
    }
}