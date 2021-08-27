package bankerPack;

public class Main {
    public static void main(String args[]) {
        BankAccount bankAccount = new BankAccount("Nata");

        bankAccount.deposit(1000);

        bankAccount.deposit(2000);

        bankAccount.withdrawal(500);

        // When she prints her bank statement
        System.out.println(bankAccount.generateStatement());
    }
}