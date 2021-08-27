package bankerPack;

import java.time.LocalDate;
import java.util.ArrayList;

public class Statement {
    private String name;
    private ArrayList transactions = new ArrayList();
    private BankAccount account;
    private LocalDate transactionDate;


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
        latestTransactionsFirst();
        String output = "";
        float statementBalance = account.getBalance();
        for (int i = 0; i < transactions.size(); i++) {

            Transaction transaction = (Transaction) transactions.get(i);
            String printBalance = String.format("%.02f", statementBalance);

            output += transaction.getPrintDate() + " || " + depositOrWithdrawal(transaction) + printBalance + "\n";
            statementBalance -= transaction.getAmount();
        }
        return output;
    }

    private String depositOrWithdrawal(Transaction transaction) {
        String printAmount = String.format("%.02f", Math.abs(transaction.getAmount()));
        if (transaction.getKind() == "deposit") {
            return printAmount + " || - || ";
        } else if (transaction.getKind() == "withdrawal") {
            return "- || " + printAmount + " || ";
        }
        return null;
    }

    private void latestTransactionsFirst () {
        transactions.sort(new DateSorter());
    }

}

