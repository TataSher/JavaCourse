package bankerPack;

import java.util.ArrayList;

public class BankAccount {
    private String name;
    private Integer balance;
    private ArrayList deposits = new ArrayList();

    public BankAccount (String name) {
        this.name = name;
        this.balance = 0;
        this.deposits = deposits;
    }

    public String showName () {
        return name;
    }
    public Integer showBalance () {
        return balance;
    }

    public void deposit (Integer amount) {
      Transaction transaction = new Transaction(amount);
        deposits.add(transaction);
    }

    public String showTransactions () {
        String output = "";
        for (int i=0; i<deposits.size(); i++) {

            Transaction transaction = (Transaction) deposits.get(i);
            output += "date: " + transaction.showDate() + " deposit: "+ transaction.showAmount() +"$\n";
        }
        return output;
    }

    public String printStatement () {
        return "Account Holder: " + name +"\ndate| deposit | withdrawal | balance";
    }

}
