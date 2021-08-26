package bankerPack;

import java.util.ArrayList;

public class Statement {
    private String name;
    private ArrayList transactions = new ArrayList();
    private Integer balance;

    public Statement (BankAccount bankAccount ) {
        this.name = name;
        this.transactions = transactions;
        this.balance = balance;
    }
    String print() {
        return "Account Holder: Kuma Bear\ndate| deposit | withdrawal | balance";
    }
}

//    public String showTransactions () {
//        String output = "";
//        for (int i=0; i<transactions.size(); i++) {
//
//            Transaction transaction = (Transaction) transactions.get(i);
//
//            output += "date: " + transaction.showDate() + " "  + transaction.getKind() + ": "+ transaction.showAmount() +"$\n";
//        }
//        return output;
//    }