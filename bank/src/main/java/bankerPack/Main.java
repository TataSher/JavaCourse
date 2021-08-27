package bankerPack;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Nata");

        account1.deposit(1000, LocalDate.of(2021, 1, 10));

        account1.deposit(2000, LocalDate.of(2021, 1, 13));

        account1.withdraw(500, LocalDate.of(2021, 1, 14));

        System.out.println(account1.generateStatement());
    }
}