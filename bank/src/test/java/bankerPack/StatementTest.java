package bankerPack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatementTest {
    MockBankAccount mockAccount = new MockBankAccount("Kuma Bear");

    @Test
    @DisplayName("Prints first line of statement when no previous transactions took place")
    void testStatementWithNoPreviousTransactions() {
        Statement statement1 = new Statement(mockAccount);
        String result = statement1.print();
        assertEquals("Account Holder: Kuma Bear\ndate || credit || debit || balance\n", result);
    }

    @Test
    @DisplayName("Prints a statement with one transaction")
    void testShowTransactionsWithDepositAndWithdrawal() {
        mockAccount.deposit(100, LocalDate.of(2021, 8, 27));
        Statement statement1 = new Statement(mockAccount);
        String result = statement1.print();
        assertEquals("Account Holder: Kuma Bear\ndate || credit || debit || balance\n27/08/2021 || 100.00 || - || 100" +
                ".00\n" , result);
    }

    private class MockBankAccount implements IBankAccount {
        private float balance = 0;
        private String name ;
        private ArrayList transactions = new ArrayList();

        public MockBankAccount (String name) {
            this.name = name;
            this.balance = 0;
        }

        @Override
        public ArrayList getTransactions() {
            return transactions;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public float getBalance() {
            return balance;
        }

        @Override
        public void deposit(float amount, LocalDate of) {
            Transaction transaction = new Transaction(amount, of);
            transactions.add(transaction);
            setBalance(transaction.getAmount());
        }

        @Override
        public void withdraw(float amount, LocalDate of) {
            Transaction transaction = new Transaction(-Math.abs(amount), of);
            transactions.add(transaction);
            setBalance(transaction.getAmount());
        }

        private void setBalance(float amount) {
            balance += amount;
        }
    }
}
