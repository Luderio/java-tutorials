package dev.luderiosanchez.exercises.collections.comparable_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Ian"));
        customers.add(new Customer("Chezzy"));
        customers.add(new Customer("Hero"));
        Collections.sort(customers);
        System.out.println(customers);
    }
}