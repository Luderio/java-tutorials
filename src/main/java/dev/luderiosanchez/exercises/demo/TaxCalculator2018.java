package dev.luderiosanchez.exercises.demo;

public class TaxCalculator2018 implements TaxCalculator {
    private final double taxableIncome;
    private double taxRate = 0.3;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        return taxableIncome * taxRate;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
}
