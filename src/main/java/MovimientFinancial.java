import ValueObject.Date;

import java.time.LocalDate;

public class MovimientFinancial {
    private double credit;
    private double debit;
    private double saldo;
    private Date date;

    public MovimientFinancial() {}

    public MovimientFinancial(double credit, double debit, double saldo, Date date) {
        this.credit = credit;
        this.debit = debit;
        this.saldo = saldo;
        this.date = date;
    }

    @Override
    public String toString() {
        return "MovimientFinancial{" +
                "credit=" + credit +
                ", debit=" + debit +
                ", saldo=" + saldo +
                ", date=" + date.getDate() +
                '}';
    }
}
