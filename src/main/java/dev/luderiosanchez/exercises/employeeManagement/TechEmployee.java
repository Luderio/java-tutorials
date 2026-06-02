package dev.luderiosanchez.exercises.employeeManagement;

public class TechEmployee implements Employee {
    private String name;
    private String department;
    private double salary;

    public TechEmployee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String printDetails() {
        return "Name: " + this.getName() + ", Department: " + this.getDepartment() +  ", Salary: " + this.getSalary();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public double calculateTax() {
        final double taxRate = 0.3;
        return salary * taxRate;
    }
}
