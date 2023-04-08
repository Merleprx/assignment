package de.dhbw.wwi2022h.prog2.assignment1;

/**
 * Anmerkung: Diese Datei darf nicht bearbeitet werden!
 * Monatlicher Gehaltszettel für genau einen Mitarbeiter
 */
public interface Payslip {
    /**
     * Berechnet das gesamte Monatsgehalt des Arbeiters inkl. aller Boni
     *
     * @return Errechnetes Gesamtgehalt
     */
    double calculateSalary();

    /**
     * Berechnet alle Boni des Arbeiters exkl. Stundengehalt/ Grundgehalt
     *
     * @return Errechneter Bonus
     */
    double calculateBonus();
}
