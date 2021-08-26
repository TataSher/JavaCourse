package bankerPack;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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

//    @Test
//    void testShowTransactionsWithOneDeposit() {
//        BankAccount account1 = new BankAccount("Kumbajan Aubergino");
//        account1.deposit(100);
//        ArrayList result = account1.showTransactions();
//        assertEquals([transaction1], result);
//    }

//    @Test
//    void testShowTransactionsWithDepositAndWithdrawal() {
//        BankAccount account1 = new BankAccount("Kumbajan Aubergino");
//        account1.deposit(100);
//        account1.withdrawal(-10);
//        String result = account1.showTransactions();
//        assertEquals("date: 26-08-2021 deposit: 100$\ndate: 26-08-2021 withdrawal: -10$\n", result);
//    }


    @Test
    void testPrintStatementZeroTransactions() {
        BankAccount account1 = new BankAccount("Kumbajan Aubergino");
        String result = account1.printStatement();
        assertEquals("Account Holder: Kumbajan Aubergino\ndate| deposit | withdrawal | balance\n", result);
    }

}
