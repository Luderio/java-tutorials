package dev.luderiosanchez.exercises.demo;


public class Main {
    private static final ConsoleLog log = new ConsoleLog();


    public static void main(String[] args) {
       var employee1 = new Employee(68686, 30, 10);
       int wage1 = employee1.calculateWage(20);

        var employee2 = new Employee(68686);
        int wage2 = employee2.calculateWage();

       log.info("The Employee1 salary is: " + wage1);
       log.info("The Employee2 salary is: " + wage2);
       log.info("Total Number of Employees: " + Employee.getNumberOfEmployees());
    }
}
