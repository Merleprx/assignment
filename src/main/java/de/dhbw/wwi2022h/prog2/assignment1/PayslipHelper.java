package de.dhbw.wwi2022h.prog2.assignment1;

import de.dhbw.wwi2022h.prog2.assignment1.impl.DefaultMonthlyPayroll;
import de.dhbw.wwi2022h.prog2.assignment1.impl.EmployeePayslip;
import de.dhbw.wwi2022h.prog2.assignment1.impl.ManagerPayslip;
import de.dhbw.wwi2022h.prog2.assignment1.impl.WorkerPayslip;

/**
 * Anmerkung: Diese Datei darf nicht bearbeitet werden!
 * Hilfsklasse, die verwendet wird, um Instanzen der verschiedenen Objekte zu erstellen.
 */
public class PayslipHelper {
    /**
     * Erstellt ein EmployeePayslip Objekt mit den notwendigen Parametern
     *
     * @param wage  Monatliches Grundgehalt
     * @param bonus Monatlicher Bonus
     * @return EmployeePayslip Objekt
     * @throws PayslipException Falls beim Erstellen Fehler erkannt wurden (siehe PayslipExceptionType)
     */
    public static EmployeePayslip createEmployeePayslip(double wage, double bonus) throws PayslipException {
        return new EmployeePayslip(wage, bonus);
    }

    /**
     * Erstellt ein ManagerPayslip Objekt mit den notwendigen Parametern
     *
     * @param wage           Monatliches Grundgehalt
     * @param sales          Geldbetrag der diesen Monat getätigten Verkäufe
     * @param commissionRate Prozentuale Kommission auf alle getätigten Käufe
     * @return ManagerPayslip Objekt
     * @throws PayslipException Falls beim Erstellen Fehler erkannt wurden (siehe PayslipExceptionType)
     */
    public static ManagerPayslip createManagerPayslip(double wage, double sales, double commissionRate) throws PayslipException {
        return new ManagerPayslip(wage, sales, commissionRate);
    }

    /**
     * Erstellt ein WorkerPayslip Objekt mit den notwendigen Parametern
     *
     * @param hourlyRate      Stundenlohn
     * @param overtimePremium Bonus pro Überstunde (zusätzlich zu Stundenlohn)
     * @param workedHours     Gearbeitete Stunden
     * @param targetHours     Vertraglich vereinbarte Stunden
     * @return WorkerPayslip Objekt
     * @throws PayslipException Falls beim Erstellen Fehler erkannt wurden (siehe PayslipExceptionType)
     */
    public static WorkerPayslip createWorkerPayslip(
            double hourlyRate,
            double overtimePremium,
            double workedHours,
            double targetHours
    ) throws PayslipException {
        return new WorkerPayslip(hourlyRate, overtimePremium, workedHours, targetHours);
    }

    /**
     * Erstellt ein MonthlyPayroll Objekt mit den notwendigen Parametern
     *
     * @param maxPayslips Maximal hinzufügbare Menge von Payslips
     * @return MonthlyPayroll Objekt
     * @throws PayslipException Falls beim Erstellen Fehler erkannt wurden (siehe PayslipExceptionType)
     */
    public static DefaultMonthlyPayroll createDefaultMonthlyPayroll(int maxPayslips) throws PayslipException {
        return new DefaultMonthlyPayroll(maxPayslips);
    }
}
