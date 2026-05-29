package dev.luderiosanchez.exercises.demo;


public class Main {
    private static final ConsoleLog log = new ConsoleLog();


    public static void main(String[] args) {
       var employee1 = new Employee();
       employee1.setBaseSalary(68686);
       employee1.setHourlyRate(30);
       int wage = employee1.calculateWage(8);
        log.info("The Employee's salary is: " + wage, wage);
    }
}
