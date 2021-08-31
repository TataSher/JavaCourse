package bankerPack;

import java.time.LocalDate;
import java.util.ArrayList;

    public class BankAccount implements IBankAccount {
    private float balance = 0;
    private String name ;
    private ArrayList transactions = new ArrayList();

    public BankAccount (String name) {
        this.name = name;
        this.balance = 0;
    }
    @Override
    public ArrayList getTransactions() { return transactions; }

    @Override
    public String getName() { return name; }

    public void deposit (float amount, LocalDate of) {
        positiveAmount(amount);
        Transaction transaction = new Transaction(amount, of);
        transactions.add(transaction);
        setBalance(transaction.getAmount());
    }

      private void positiveAmount (float amount) {
         if (amount <= 0) {
             throw new ArithmeticException("Amount must be positive");
         }
    }

    public void withdraw(float amount, LocalDate of) {
        insufficientFunds(amount);
        Transaction transaction = new Transaction(-Math.abs(amount), of);
        transactions.add(transaction);
        setBalance(transaction.getAmount());
    }

    private void insufficientFunds (float amount) {
        if (balance <= amount) {
            throw new ArithmeticException("Insufficient Funds");
        }
    }

    public String generateStatement () {
        Statement statement = new Statement(this);
        return statement.print();
    }

    public void setBalance(float amount) {
        balance += amount;
    }

    @Override
    public float getBalance() {
        return balance;
    }

}

