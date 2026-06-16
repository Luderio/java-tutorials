package dev.luderiosanchez.exercises.iterable.collections.list.comparable_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Ian"));
        customers.add(new Customer("Chezzy"));
        customers.add(new Customer("Hero"));
        System.out.println(customers);
        customers.add(0, new Customer("Isla1"));
        customers.add(0, new Customer("Isla2"));
        customers.add(0, new Customer("Isla3"));
        customers.add(0, new Customer("Isla4"));
        customers.add(0, new Customer("Isla5"));
        customers.add(0, new Customer("Isla6"));
        customers.add(0, new Customer("Isla7"));
        customers.add(0, new Customer("Isla8"));
        customers.add(0, new Customer("Isla9"));
        System.out.println(customers);
        Collections.sort(customers);
        System.out.println(customers);
        customers.remove(0);
        System.out.println(customers);
    }
}