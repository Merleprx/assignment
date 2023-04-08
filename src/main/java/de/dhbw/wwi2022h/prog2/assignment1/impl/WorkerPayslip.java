package de.dhbw.wwi2022h.prog2.assignment1.impl;

import de.dhbw.wwi2022h.prog2.assignment1.Payslip;
import de.dhbw.wwi2022h.prog2.assignment1.PayslipException;
import de.dhbw.wwi2022h.prog2.assignment1.PayslipExceptionType;

public class WorkerPayslip implements Payslip {
    private final double hourlyRate;
    private final double overtimePremium;
    private final double workedHours;
    private final double targetHours;

    public WorkerPayslip(double hourlyRate, double overtimePremium, double workedHours, double targetHours) throws PayslipException {
        checkArguments(hourlyRate, overtimePremium, workedHours, targetHours);
        this.hourlyRate = hourlyRate;
        this.overtimePremium = overtimePremium;
        this.workedHours = workedHours;
        this.targetHours = targetHours;
    }

    private void checkArguments(double hourlyRate, double overtimePremium, double workedHours, double targetHours) throws PayslipException {
        if (hourlyRate < 0 || overtimePremium < 0 || workedHours < 0 || targetHours < 0) {
            throw new PayslipException(PayslipExceptionType.UNEXPECTED_NEGATIVE_VALUE);
        }
        if (workedHours < targetHours) {
            throw new PayslipException(PayslipExceptionType.NOT_ENOUGH_HOURS);
        }
        if (overtimePremium > 0.5 * hourlyRate) {
            throw new PayslipException(PayslipExceptionType.BONUS_TOO_HIGH);
        }
    }

    public double calculateSalary() {
        double salary = hourlyRate * workedHours;
        double overtimeHours = workedHours - targetHours;
        double overtimePay = overtimePremium * overtimeHours;
        return salary + overtimePay;
    }

    public double calculateBonus() {
        double overtimeHours = workedHours - targetHours;
        double bonus = overtimePremium * overtimeHours;
        return bonus;
    }
}