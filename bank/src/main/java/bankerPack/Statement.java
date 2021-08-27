package bankerPack;

import java.util.ArrayList;

public class Statement {
    private String name;
    private ArrayList transactions = new ArrayList();
    private BankAccount account;


    public Statement (BankAccount bankAccount ) {
        this.name = bankAccount.getName();
        this.transactions = bankAccount.getTransactions();
        this.account = bankAccount;
    }

    String print() {
        return printHead() + printTransactions();
    }

    private String printHead() {
        return "Account Holder: " + name + "\ndate || credit || debit || balance\n";

    }

    private String printTransactions() {
        String output = "";
        float statementBalance = 0;
        for (int i = 0; i < transactions.size(); i++) {

            Transaction transaction = (Transaction) transactions.get(i);
            statementBalance += transaction.getAmount();
            String printBalance = String.format("%.02f", statementBalance);

            output += transaction.getDate() + " || " + depositOrWithdrawal(transaction) + printBalance + "\n";
        }
        return output;
    }

    private String depositOrWithdrawal(Transaction transaction) {
        String printAmount = String.format("%.02f", transaction.getAmount());
        if (transaction.getKind() == "deposit") {
            return "- || " + printAmount + " || ";
        } else if (transaction.getKind() == "withdrawal") {
            return printAmount + " || - || ";
        }
        return null;
    }

}

