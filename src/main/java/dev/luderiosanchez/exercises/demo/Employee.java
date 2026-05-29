package dev.luderiosanchez.exercises.demo;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    private int extraHours;

    private static int numberOfEmployees;

    public Employee(int baseSalary, int hourlyRate, int extraHours) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        setExtraHours(extraHours);
        numberOfEmployees++;
    }

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        setExtraHours(0);
        numberOfEmployees++;
    }

    public Employee(int baseSalary) {
        setBaseSalary(baseSalary);
        setHourlyRate(0);
        setExtraHours(0);
        numberOfEmployees++;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public int calculateWage(int extraHours) {
        return getBaseSalary() + (getHourlyRate() * extraHours);
    }
    public int calculateWage() {
        return getBaseSalary() + (getHourlyRate() * getExtraHours());
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Base Salary cannot be 0 or negative number.");
        }
        this.baseSalary = baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {

        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly rate cannot be 0 or negative number.");
        }
        this.hourlyRate = hourlyRate;
    }

    private void setExtraHours(int extraHours) {
        this.extraHours = extraHours;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private int getExtraHours() {
        return extraHours;
    }
}
