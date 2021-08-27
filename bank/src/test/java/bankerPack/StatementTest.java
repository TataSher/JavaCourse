package bankerPack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatementTest {
    BankAccount account1 = new BankAccount("Kuma Bear");

    @Test
    @DisplayName("Prints first line of statement when no previous transactions took place")
    void testStatementWithNoPreviousTransactions() {
        Statement statement1 = new Statement(account1);
        String result = statement1.print();
        assertEquals("Account Holder: Kuma Bear\ndate| deposit | withdrawal | balance\n", result);
    }

    @Test
    @DisplayName("Prints a statement with one transaction")
    void testShowTransactionsWithDepositAndWithdrawal() {
        account1.deposit(100);
        Statement statement1 = new Statement(account1);
        String result = statement1.print();
        assertEquals("Account Holder: Kuma Bear\ndate| deposit | withdrawal | balance\n27-08-2021 | 100.00 | - | 100" +
                ".00\n", result);
    }
}
