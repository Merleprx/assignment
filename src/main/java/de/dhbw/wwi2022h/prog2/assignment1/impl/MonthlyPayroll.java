package de.dhbw.wwi2022h.prog2.assignment1.impl;


import de.dhbw.wwi2022h.prog2.assignment1.Payslip;
import de.dhbw.wwi2022h.prog2.assignment1.PayslipException;
import de.dhbw.wwi2022h.prog2.assignment1.PayslipExceptionType;

import java.util.LinkedList;
import java.util.List;

public class MonthlyPayroll {

    List<Payslip> payslipsList;

    final int maxPayslips;

    public MonthlyPayroll(int pMaxPayslips) {
        this.maxPayslips= pMaxPayslips;
        this.payslipsList = new LinkedList<>();
    }

    public Payslip[] getAllPayslips() {
        return this.payslipsList.toArray(new Payslip[this.payslipsList.size()]);
    }

    public int getAmountOfPayslips() {
        return this.payslipsList.size();
    }

    public Payslip getPayslip(int index) throws PayslipException {
        if (index > this.maxPayslips || index < 0) {
            throw new PayslipException(PayslipExceptionType.INDEX_TOO_HIGH);
        }
        return this.payslipsList.get(index);
    }

    public void addPayslip(Payslip payslip) throws PayslipException {
        if (this.payslipsList.size() > maxPayslips) {
            throw new PayslipException(PayslipExceptionType.PAYSLIP_OVERFLOW);
        }
        this.payslipsList.add(payslip);
    }

    public double getTotalLaborCost() {
        double totalCost = 0.0;

        for(Payslip current : payslipsList) {
            totalCost+= current.calculateSalary();
        }

        return totalCost;
    }

    public double getTotalBonusCost() {
        double totalBonus = 0.0;
        for (Payslip current : payslipsList) {
            totalBonus += current.calculateBonus();
        }
        // Kommentar

        return totalBonus;
    }
}
