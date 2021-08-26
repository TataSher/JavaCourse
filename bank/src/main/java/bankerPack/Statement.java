package bankerPack;

import java.util.ArrayList;

public class Statement {
    private String name;
    private ArrayList transactions = new ArrayList();
    private Integer balance = 0;

    public Statement (BankAccount bankAccount ) {
        this.name = bankAccount.showName();
        this.transactions = bankAccount.showTransactions();
        this.balance = balance;
    }

    String print() {
        return printHead() + printTransactions();
    }

    private String printHead() {
        return "Account Holder: " + name + "\ndate| deposit | withdrawal | balance\n";

    }

    private String printTransactions() {
        String output = "";
        for (int i = 0; i < transactions.size(); i++) {

            Transaction transaction = (Transaction) transactions.get(i);
            addBalance(transaction.showAmount());

            output += transaction.showDate() + " | " + depositOrWithdrawal(transaction) + balance + "\n";
        }
        return output;
    }

    private String depositOrWithdrawal(Transaction transaction) {
        if (transaction.getKind() == "deposit") {
            return transaction.showAmount() + " | - | ";
        } else if (transaction.getKind() == "withdrawal") {
            return "- | " + transaction.showAmount() + " | ";
        }
        return null;
    }

    private void addBalance(Integer amount) {
        balance += amount;
    }
}

