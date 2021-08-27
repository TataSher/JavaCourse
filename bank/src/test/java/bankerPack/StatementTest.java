package bankerPack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatementTest {
    BankAccount account1 = new BankAccount("Kuma Bear");

    @Test
    @DisplayName("Prints first line of statement when no previous transactions took place")
    void testStatementWithNoPreviousTransactions() {
        Statement statement1 = new Statement(account1);
        String result = statement1.print();
        assertEquals("Account Holder: Kuma Bear\ndate || credit || debit || balance\n", result);
    }

    @Test
    @DisplayName("Prints a statement with one transaction")
    void testShowTransactionsWithDepositAndWithdrawal() {
        account1.deposit(100, LocalDate.of(2021, 8, 27));
        Statement statement1 = new Statement(account1);
        String result = statement1.print();
        assertEquals("Account Holder: Kuma Bear\ndate || credit || debit || balance\n27/08/2021 || 100.00 || - || 100" +
                ".00\n" , result);
    }
}
