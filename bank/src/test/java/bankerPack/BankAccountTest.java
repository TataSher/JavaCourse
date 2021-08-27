package bankerPack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    BankAccount account1 = new BankAccount("Kumbajan Aubergino");

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
        account1.deposit(100, LocalDate.of(2021, 8, 27));
        float result = account1.getBalance();
        assertEquals(100, result);
    }

    @Test
    void testShowTransactionsWithDepositAndWithdrawal() {
        account1.deposit(100, LocalDate.of(2021, 8, 27));
        account1.withdraw(20, LocalDate.of(2021, 8, 27));
        float result = account1.getBalance();
        assertEquals(80, result);
    }

    @Test
    void testCantDepositNegativeAmount() {
        Assertions.assertThrows(ArithmeticException.class, () -> account1.deposit(-20, LocalDate.of(2021, 8, 27)));
    }

    @Test
    void testCantWithdrawWithMoreThanBalance() {
        Assertions.assertThrows(ArithmeticException.class, () -> account1.withdraw(20, LocalDate.of(2021, 8, 27)));
    }

    @Test
    void testPrintStatementWithOneTransaction() {
        account1.deposit(100, LocalDate.of(2021, 8, 27));
        String result = account1.generateStatement();
        assertEquals("Account Holder: Kumbajan Aubergino\ndate || credit || debit || balance\n27/08/2021 || 100.00 || - || 100.00\n", result);
    }

    @Test
    void testPrintStatementWithTwoTransactions() {
        account1.deposit(100, LocalDate.of(2021, 8, 27));
        account1.withdraw(10, LocalDate.of(2021, 8, 27));
        String result = account1.generateStatement();
        assertEquals("Account Holder: Kumbajan Aubergino\ndate || credit || debit || balance\n27/08/2021 || 100.00 || - || 100.00\n27/08/2021 || - || 10.00 || 90.00\n", result);
    }

    @Test
    void testPrintStatementWithTwoTransactionsAtDifferentDates() {
        account1.deposit(100, LocalDate.of(2021, 8, 27));
        account1.withdraw(10, LocalDate.of(2021, 9, 27));
        String result = account1.generateStatement();
        assertEquals(
                "Account Holder: Kumbajan Aubergino\ndate || credit || debit || balance\n27/09/2021 || - || 10.00 || " +
                        "90.00\n27/08/2021 || 100.00 || - || 100.00\n", result);
    }

    @Test
    void testGetFinalBalance() {
        account1.deposit(100, LocalDate.of(2021, 8, 27));
        account1.withdraw(10, LocalDate.of(2021, 1, 14));
        float result = account1.getBalance();
        assertEquals(90, result);
    }
}
