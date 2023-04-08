package de.dhbw.wwi2022h.prog2.assignment1;

/**
 * Die Reihenfolge der Fehlertypen ist als Priorität zu sehen.
 * Sollte bspw. UNEXPECTED_NEGATIVE_VALUE und NOT_ENOUGH_HOURS
 * gleichzeitig auftreten, werft ihr UNEXPECTED_NEGATIVE_VALUE
 */
public enum PayslipExceptionType {
    UNEXPECTED_NEGATIVE_VALUE,      // Alle Werte, außer der Bonus eines Employees, müssen größer oder gleich 0 sein
    COMMISSION_RATE_TOO_HIGH,       // Die prozentuale Kommission eines Managers darf 25 % der Sales nicht übersteigen
    NOT_ENOUGH_HOURS,               // Worker dürfen nicht weniger als 40 Stunden gearbeitet haben
    BONUS_TOO_HIGH,                 // Worker & Employee Boni dürfen ausgerechnet 50 % ihres regulären Lohns nicht übersteigen
    PAYSLIP_OVERFLOW,               // addPayslip darf keine weiteren Payslips hinzufügen, nachdem maxPayslips erreicht wurde
    INDEX_TOO_HIGH,                 // Falls getPayslip mit einem Index aufgerufen wird, der größer als maxPayslips ist
}
