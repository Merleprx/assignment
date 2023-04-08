package de.dhbw.wwi2022h.prog2.assignment1;

/**
 * Anmerkung: Diese Datei darf nicht bearbeitet werden!
 * Verwaltungsobjekt für alle Gehälter eines Monats
 */
public interface MonthlyPayroll {
    /**
     * Liefert eine Liste aller hinzugefügten Gehaltszettel
     *
     * @return Liste aller Gehaltszettel. Darf leere Felder enthalten.
     */
    Payslip[] getAllPayslips();

    /**
     * Liefert die Anzahl der gespeicherten Payslips.
     * Leere Felder dürfen dabei nicht mitgezählt werden.
     *
     * @return Anzahl aller Gehaltszettel.
     */
    int getAmountOfPayslips();

    /**
     * Liefert den Payslip an Stelle 'index'.
     *
     * @return Payslip an Stelle 'index', oder null, falls dort keiner existiert.
     * @throws PayslipException Falls 'index' zu groß oder negativ ist.
     */
    Payslip getPayslip(int index) throws PayslipException;

    /**
     * Fügt dem Verwaltungsobjekt einen Gehaltszettel hinzu, falls im Array noch Platz ist
     *
     * @param payslip Gehaltszettel
     * @throws PayslipException Falls maxPayslips bereits erreicht wurde.
     */
    void addPayslip(Payslip payslip) throws PayslipException;

    /**
     * Berechnet die Gesamtkosten aller Gehaltszettel inkl. Boni
     *
     * @return Gesamtkosten aller Gehaltszettel
     */
    double getTotalLaborCost();

    /**
     * Berechnet die Gesamtkosten aller Boni exkl. Stundengehalt/ Grundgehalt
     *
     * @return Gesamtkosten aller Boni
     */
    double getTotalBonusCost();
}
