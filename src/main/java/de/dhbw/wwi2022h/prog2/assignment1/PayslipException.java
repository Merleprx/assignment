package de.dhbw.wwi2022h.prog2.assignment1;

/**
 * Anmerkung: Diese Datei darf nicht bearbeitet werden!
 * Exception für Fehler der Payslip Verwaltung
 */
public class PayslipException extends Exception {
    private final PayslipExceptionType type;

    public PayslipException(PayslipExceptionType type) {
        this.type = type;
    }

    /**
     * Gibt den Typen des aufgetretenen Fehlers zurück
     * @return Aufgetretener Fehler
     */
    public PayslipExceptionType getType() {
        return type;
    }
}
