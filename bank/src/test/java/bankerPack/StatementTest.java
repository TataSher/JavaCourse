package bankerPack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatementTest {
    @Test
    @DisplayName("Prints first line of statement when no previous transactions took place")
    void testStatementWithNoPreviousTransactions() {
        BankAccount account1 = new BankAccount("Kuma Bear");
        Statement statement1 = new Statement(account1);
        String result = statement1.print();
        assertEquals("Account Holder: Kuma Bear\ndate| deposit | withdrawal | balance\n", result);
    }

    @Test
    @DisplayName("Prints a statement with one transaction")
    void testShowTransactionsWithDepositAndWithdrawal() {
        BankAccount account1 = new BankAccount("Kuma Bear");
        account1.deposit(100);
        Statement statement1 = new Statement(account1);
        String result = statement1.print();
        assertEquals("Account Holder: Kuma Bear\ndate| deposit | withdrawal | balance\n27-08-2021 | 100 | - | 100\n", result);
    }
}
