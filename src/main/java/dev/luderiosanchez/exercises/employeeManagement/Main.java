package dev.luderiosanchez.exercises.employeeManagement;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new TechEmployee("Luderio Sanchez", "IT", 70_000);
        Manager manager1 = new Manager("Kim Madriaga", "Human Resources", 100_000D);

        System.out.println(employee1.printDetails());
        System.out.println(employee1.calculateTax());
        System.out.println(manager1.printDetails());
        System.out.println(manager1.calculateTax());

        Employee employee2 = new TechEmployee("Ian Rusiana", "IT", 30_000D);
        Manager manager2 = new Manager("Hero Rusiana", "Human Resources", 100_000D);

        System.out.println(employee2.printDetails());
        System.out.println(employee2.calculateTax());
        System.out.println(manager2.printDetails());
        System.out.println(manager2.calculateTax());

    }
}