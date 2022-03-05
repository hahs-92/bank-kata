
public class Balance {
    private double balance;

    public Balance() {
    }

    public Balance(double balance) {
        this.balance = balance;
    }

    public void increaseBalance(double credit) {
        this.balance = balance + credit;
    }

    public void deductBalance(double debit) {
        this.balance = balance - debit;
    }

    public double getBalance() {
        return this.balance;
    }
}
