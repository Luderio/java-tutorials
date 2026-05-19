package dev.luderiosanchez.exercises.mortgage;

import java.util.Locale;
import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    private static double calculateMortgage(double principal, float annualInterest, byte period) {
        final byte MONTHS_IN_A_YEAR = 12;
        final byte PERCENT = 100;

       double monthlyInterest = (annualInterest / PERCENT) / MONTHS_IN_A_YEAR;
       int numberOfPayments = period * MONTHS_IN_A_YEAR;

       return principal * (monthlyInterest * Math.pow((1 + monthlyInterest), numberOfPayments)) / (Math.pow((1 + monthlyInterest), numberOfPayments) - 1);
    }

    public static String getMonthlyPayments() {
        System.out.println("Mortgage Calculator");
        Scanner scanner = new Scanner(System.in);

        double principal = (double) MortgageUtils.inputValidator(1_000, 1_000_000, "Principal", scanner);
        float annualInterest = (float) MortgageUtils.inputValidator(0, 30, "Annual Interest", scanner);
        byte period = (byte) MortgageUtils.inputValidator(1, 30, "Period", scanner);

        String monthlyPayments = NumberFormat.getCurrencyInstance(Locale.of("en", "PH")).format(calculateMortgage(principal, annualInterest, period));

        return "Monthly Payment: " + monthlyPayments;
    }


}