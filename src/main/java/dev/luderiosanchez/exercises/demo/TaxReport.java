package dev.luderiosanchez.exercises.demo;

public class TaxReport {

    private TaxCalculator calculator;

    // constructor dependency injection
    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }
}
