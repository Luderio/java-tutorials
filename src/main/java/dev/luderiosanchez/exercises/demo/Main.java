package dev.luderiosanchez.exercises.demo;


public class Main {
    public static void main(String[] args) {
       var employee1 = new Employee();
       employee1.setBaseSalary(68686);
       employee1.setHourlyRate(30);
       int wage = employee1.calculateWage(8);
        System.out.println(wage);
    }
}
