package dev.luderiosanchez.exercises.demo;


public class Main {
    public static void main(String[] args) {
        TaxCalculator2018 calculator = new TaxCalculator2018(70_000);
        TaxReport report = new TaxReport(calculator);
    }
}
