package dev.luderiosanchez.exercises.generics;

import dev.luderiosanchez.exercises.generics.User;
import dev.luderiosanchez.exercises.generics.Utils;

public class Main {
    public static void main(String[] args) {

        var users = new GenericList<User>(11);
        users.add(new User(1));
        users.add(new User(2));
        users.add(new User(3));
        users.add(new User(4));
        users.add(new User(5));
        users.add(new User(6));
        users.add(new User(7));
        users.add(new User(8));
        users.add(new User(9));
        users.add(new User(10));
        System.out.println("Length: " + users.getCount());
        Utils.printUsers(users);

        System.out.println("\n\n");

        var instructors = new GenericList<Instructor>(15);
        instructors.add(new Instructor(11));
        instructors.add(new Instructor(12));
        instructors.add(new Instructor(13));
        instructors.add(new Instructor(14));
        instructors.add(new Instructor(15));
        instructors.add(new Instructor(16));
        instructors.add(new Instructor(17));
        instructors.add(new Instructor(18));
        instructors.add(new Instructor(19));
        instructors.add(new Instructor(20));
        instructors.add(new Instructor(21));
        instructors.add(new Instructor(22));
        instructors.add(new Instructor(23));
        instructors.add(new Instructor(24));
        instructors.add(new Instructor(25));
        System.out.println("Length: " + instructors.getCount());
        Utils.printUsers(instructors);

        System.out.println("\n\n");

        var numbers = new GenericList<Integer>(15);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        System.out.println("Length: " + numbers.getCount());
        Utils.printUsers(numbers);
    }
}
