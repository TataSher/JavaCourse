package bankerPack;

import java.util.ArrayList;

public class BankAccount {
    private String name;
    private Integer balance;
    private ArrayList transactions = new ArrayList();

    public BankAccount (String name) {
        this.name = name;
        this.balance = 0;
        this.transactions = transactions;
    }

    public String showName () {
        return name;
    }
    public Integer showBalance () {
        return balance;
    }

    public void deposit (Integer amount) {
      Transaction transaction = new Transaction(amount);
        transactions.add(transaction);
    }

    public void withdrawal (Integer amount) {
        Transaction transaction = new Transaction(amount);
        transactions.add(transaction);
    }

    public String showTransactions () {
        String output = "";
        for (int i=0; i<transactions.size(); i++) {

            Transaction transaction = (Transaction) transactions.get(i);

            output += "date: " + transaction.showDate() + " "  + transaction.getKind() + ": "+ transaction.showAmount() +"$\n";
        }
        return output;
    }

    public String printStatement () {
        return "Account Holder: " + name +"\ndate| deposit | withdrawal | balance";
    }

}
