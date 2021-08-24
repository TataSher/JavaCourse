package bankerPack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    @Test
    void testCreateBankAccountWithName() {
        BankAccount account1 = new BankAccount("Kumbajan Aubergino");
        String result = account1.showName();
        assertEquals("Kumbajan Aubergino", result);
    }

    @Test
    void testCreateBankAccountWithBalance() {
        BankAccount account1 = new BankAccount("Kumbajan Aubergino");
        Integer result = account1.showBalance();
        assertEquals(0, result);
    }

    @Test
    void testShowTransactions() {
        BankAccount account1 = new BankAccount("Kumbajan Aubergino");
        account1.deposit(100);
        String result = account1.showTransactions();
        assertEquals("date: 24-08-2021 deposit: 100$", result);
    }

    @Test
    void testPrintStatementZeroTransactions() {
        BankAccount account1 = new BankAccount("Kumbajan Aubergino");
        String result = account1.printStatement();
        assertEquals("Account Holder: Kumbajan Aubergino\ndate| deposit | withdrawal | balance", result);
    }

}
