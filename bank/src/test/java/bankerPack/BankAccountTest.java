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
    void testShowTransactionsWithOneDeposit() {
        BankAccount account1 = new BankAccount("Kumbajan Aubergino");
        account1.deposit(100);
        int result = account1.getBalance();
        assertEquals(100, result);
    }

    @Test
    void testShowTransactionsWithDepositAndWithdrawal() {
        BankAccount account1 = new BankAccount("Kumbajan Aubergino");
        account1.deposit(100);
        account1.withdrawal(20);
        int result = account1.getBalance();
        assertEquals(80, result);
    }


    @Test
    void testPrintStatementWithOneTransaction() {
        BankAccount account1 = new BankAccount("Kumbajan Aubergino");
        account1.deposit(100);
        String result = account1.printStatement();
        assertEquals("Account Holder: Kumbajan Aubergino\ndate| deposit | withdrawal | balance\n27-08-2021 | 100 | - | 100\n", result);
    }

    @Test
    void testPrintStatementWithTwoTransactions() {
        BankAccount account1 = new BankAccount("Kumbajan Aubergino");
        account1.deposit(100);
        account1.withdrawal(10);
        String result = account1.printStatement();
        assertEquals("Account Holder: Kumbajan Aubergino\ndate| deposit | withdrawal | balance\n27-08-2021 | 100 | - | 100\n27-08-2021 | - | -10 | 90\n", result);
    }

    @Test
    void testGetFinalBalance() {
        BankAccount account1 = new BankAccount("Kumbajan Aubergino");
        account1.deposit(100);
        account1.withdrawal(10);
        int result = account1.getBalance();
        assertEquals(90, result);
    }


}
