package dev.luderiosanchez.exercises.mortgage;

import java.util.Scanner;

public class MortgageUtils {
    public static Number inputValidator(int min, int max, String fieldName, Scanner scanner) {
        while (true) {
            System.out.print(fieldName + ": ");
            switch (fieldName) {
                case "Principal":
                    double principal = scanner.nextDouble();
                    if (principal < min || principal > max) {
                        System.out.println("Enter an amount between " + min + " and " + max + ".");
                        continue;
                    } else {
                        return principal;
                    }
                case "Annual Interest":
                    float annualInterest = scanner.nextFloat();
                    if (annualInterest <= min || annualInterest > max) {
                        System.out.println("Enter a value greater than " + min + " and less than or equal to " + max + ".");
                        continue;
                    } else {
                        return annualInterest;
                    }
                case "Period":
                    byte period = scanner.nextByte();
                    if (period < min || period > max) {
                        System.out.println("Enter a value between " + min + " and " + max + ".");
                        continue;
                    } else {
                        return period;
                    }
                default:
                    System.out.println("Field Name is incorrect!");
            }
        }
    }
}
