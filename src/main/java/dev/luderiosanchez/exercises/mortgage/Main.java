package dev.luderiosanchez.exercises.mortgage;

public class Main {
    public static void main(String[] args) {
        String monthlyPayments = MortgageCalculator.getMonthlyPayments();
        MortgageUtils.log(MortgageUtils.LogType.INFO, monthlyPayments);
    }
}
