package de.dhbw.wwi2022h.prog2.assignment1.impl;

import de.dhbw.wwi2022h.prog2.assignment1.Payslip;
import de.dhbw.wwi2022h.prog2.assignment1.PayslipException;
import de.dhbw.wwi2022h.prog2.assignment1.PayslipExceptionType;

public class ManagerPayslip implements Payslip {
    private final double wage;
    private final double sales;
    private final double commissionRate;

    public ManagerPayslip(double wage, double sales, double commissionRate) throws PayslipException {
        this.wage = Math.max(0, wage);
        this.sales = Math.max(0, sales);
        this.commissionRate = Math.max(0, Math.min(0.25, commissionRate));
        if (commissionRate > 0.25) {
            throw new PayslipException(PayslipExceptionType.COMMISSION_RATE_TOO_HIGH);
        }
    }

    public double calculateSalary() {
        return wage + sales * commissionRate;
    }

    public double calculateBonus() {
        double salary = calculateSalary();
        return salary - wage;
    }
}