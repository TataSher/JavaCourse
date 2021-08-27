package bankerPack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    private BankAccount account1 = new BankAccount("Kumbajan Aubergino");;

    @Test
    void testCreateBankAccountWithName() {
        String result = account1.getName();
        assertEquals("Kumbajan Aubergino", result);
    }

    @Test
    void testCreateBankAccountWithBalance() {
        float result = account1.getBalance();
        assertEquals(0, result);
    }

    @Test
    void testShowTransactionsWithOneDeposit() {
        account1.deposit(100);
        float result = account1.getBalance();
        assertEquals(100, result);
    }

    @Test
    void testShowTransactionsWithDepositAndWithdrawal() {
        account1.deposit(100);
        account1.withdrawal(20);
        float result = account1.getBalance();
        assertEquals(80, result);
    }

    @Test
    void testShowTransactionsWithProhibitedWithdrawal() {
        Assertions.assertThrows(ArithmeticException.class, () -> account1.withdrawal(20));
    }

    @Test
    void testPrintStatementWithOneTransaction() {
        account1.deposit(100);
        String result = account1.printStatement();
        assertEquals("Account Holder: Kumbajan Aubergino\ndate| deposit | withdrawal | balance\n27-08-2021 | 100.00 |" +
                " - " +
                "| 100.00\n", result);
    }

    @Test
    void testPrintStatementWithTwoTransactions() {
        account1.deposit(100);
        account1.withdrawal(10);
        String result = account1.printStatement();
        assertEquals("Account Holder: Kumbajan Aubergino\ndate| deposit | withdrawal | balance\n27-08-2021 | 100.00 |" +
                " - | 100.00\n27-08-2021 | - | -10.00 | 90.00\n", result);
    }

    @Test
    void testGetFinalBalance() {
        account1.deposit(100);
        account1.withdrawal(10);
        float result = account1.getBalance();
        assertEquals(90, result);
    }
}
