package dev.luderiosanchez.exercises.demo;

public class TaxCalculator2019 implements TaxCalculator {
    private final double taxableIncome;
    private final double taxRate = 0.4;

    public TaxCalculator2019(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        System.out.println(taxableIncome * taxRate);
        return taxableIncome * taxRate;
    }


}
