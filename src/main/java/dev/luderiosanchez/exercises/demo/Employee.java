package dev.luderiosanchez.exercises.demo;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Base Salary cannot be 0 or negative number.");
        }
        this.baseSalary = baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {

        if (hourlyRate <= 0) {
            throw new IllegalArgumentException("Hourly rate cannot be 0 or negative number.");
        }
        this.hourlyRate = hourlyRate;
    }

    public int getBaseSalary() { return baseSalary; }

    public int getHourlyRate() {
        return hourlyRate;
    }
}
