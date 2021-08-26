package bankerPack;

import java.util.ArrayList;

public class Statement {
    private String name;
    private ArrayList transactions = new ArrayList();
    private BankAccount account;


    public Statement (BankAccount bankAccount ) {
        this.name = bankAccount.showName();
        this.transactions = bankAccount.showTransactions();
        this.account = bankAccount;
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
            System.out.println("TRANSACTION" + transaction + transactions);
            account.addBalance(transaction.showAmount());

            output += transaction.showDate() + " | " + depositOrWithdrawal(transaction) + account.showBalance() + "\n";
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

}

