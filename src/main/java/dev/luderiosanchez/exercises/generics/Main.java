package dev.luderiosanchez.exercises.generics;

public class Main {
    public static void main(String[] args) {
        var bigger = Utils.max(new User(5), new User(10));
        System.out.println(bigger);

        var obj = new KeyValuePair<String, String>("Name", "Luderio");
        obj.print();
    }
}
