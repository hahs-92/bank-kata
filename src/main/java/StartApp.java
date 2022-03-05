import function.Utils;

import java.lang.reflect.Array;

import static function.Utils.amountOf;
import static function.Utils.date;

public class StartApp {
    public static void main(String[] args) {
        Account account = new Account(new Statement());

        account.deposit(amountOf(1000), date("10/01/2021"));
        account.withdraw(amountOf(500), date("05/03/2021"));
        account.deposit(amountOf(100), date("31/08/2021"));
        account.printStatements();
    }
}
