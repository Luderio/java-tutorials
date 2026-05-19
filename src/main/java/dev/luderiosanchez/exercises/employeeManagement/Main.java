package dev.luderiosanchez.exercises.employeeManagement;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Luderio Sanchez", 70000.0D);
        Manager manager1 = new Manager("Kim Madriaga", 100_000D, "Human Resources");

        System.out.println(employee1.getDetails());
        System.out.println(manager1.getDetails());

        Employee employee2 = new Employee("Ian Rusiana", 30_000D);
        Manager manager2 = new Manager("Hero Rusiana", 100_000D, "Human Resources");

        System.out.println(employee2.getDetails());
        System.out.println(manager2.getDetails());

    }
}