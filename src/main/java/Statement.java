import ValueObject.Date;

import java.util.ArrayList;
import java.util.List;

public class Statement {
    private final Balance balance;
    private List<MovimientFinancial> movimientFinancials;

    public Statement() {
        this.balance = new Balance();
        this.movimientFinancials = new ArrayList<>();
    }

    public  Statement(Balance balance) {
        this.balance = balance;
    }

    public void doDeposit(double amount, String date) {
        this.balance.increaseBalance(amount);
        this.movimientFinancials
                .add(new MovimientFinancial(amount, 0, this.balance.getBalance(), new Date(date)));
    }

    public void doWithDraw(double amount, String date) {
        this.balance.deductBalance(amount);
        this.movimientFinancials
                .add(new MovimientFinancial(0,amount,  this.balance.getBalance(), new Date(date)));
    }

    public double getBalance() {
        return this.balance.getBalance();
    }

    public List<MovimientFinancial> listMovimientsFinancial() {
        return this.movimientFinancials;
    }

}
