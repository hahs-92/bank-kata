import ValueObject.Date;

import java.util.ArrayList;
import java.util.List;

public class Statement {
    private final Balance balance;
    private ListMovimientsFinancial movimientsFinancial;

    public Statement() {
        this.balance = new Balance();
        this.movimientsFinancial = new ListMovimientsFinancial();
    }

    public  Statement(Balance balance) {
        this.balance = balance;
    }

    public void doDeposit(double amount, String date) {
        this.balance.increaseBalance(amount);
        this.movimientsFinancial
                .addMovimientFinancial(
                        new MovimientFinancial(amount, 0, this.balance.getBalance(), new Date(date))
                );
    }

    public void doWithDraw(double amount, String date) {
        this.balance.deductBalance(amount);
        this.movimientsFinancial
                .addMovimientFinancial(
                        new MovimientFinancial(0,amount,  this.balance.getBalance(), new Date(date))
                );
    }

    public List<MovimientFinancial> listMovimientsFinancial() {
        return this.movimientsFinancial.showMovimientsFinancial();
    }
}
