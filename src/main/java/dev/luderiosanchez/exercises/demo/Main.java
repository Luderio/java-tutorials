package dev.luderiosanchez.exercises.demo;


public class Main {
    private static Log log = new Log();

    public Main(Log log) {
        Main.log = log;
    }

    public static void main(String[] args) {
       var employee1 = new Employee();
       employee1.setBaseSalary(68686);
       employee1.setHourlyRate(30);
       int wage = employee1.calculateWage(8);
        log.info(Logger.LogType.INFO, "The Employee's salary is: " + wage, wage);
    }
}
