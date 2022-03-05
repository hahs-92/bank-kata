import ValueObject.AccountId;

public class Account {
    private final AccountId accountId;
    private final Statement statement;

    public Account(Statement statement) {
        this.accountId = new AccountId();
        this.statement = statement;
    }

    void deposit(double amount, String date) {
        this.statement.doDeposit(amount, date);

    }

    void withdraw(double amount, String date){
        this.statement.doWithDraw(amount, date);

    }

    void printStatements() {
        this.statement.listMovimientsFinancial().forEach(m -> System.out.println(m.toString()));
    }

}
