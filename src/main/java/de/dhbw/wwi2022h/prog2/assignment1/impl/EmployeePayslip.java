package de.dhbw.wwi2022h.prog2.assignment1.impl;

import de.dhbw.wwi2022h.prog2.assignment1.Payslip;

public class EmployeePayslip implements Payslip {
    private final double wage;
    private final double bonus;

    public EmployeePayslip(double wage, double bonus) {
        if (wage < 0) {
            throw new IllegalArgumentException("Wage cannot be negative.");
        }
        if (bonus < 0) {
            throw new IllegalArgumentException("Bonus cannot be negative.");
        }
        if (bonus > 0.5 * wage) {
            throw new IllegalArgumentException("Bonus cannot be more than half the wage.");
        }
        this.wage = wage;
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return wage + bonus;
    }

    public double calculateBonus() {
        return bonus;
    }

}
