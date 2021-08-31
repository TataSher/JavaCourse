package bankerPack;

import java.time.LocalDate;
import java.util.ArrayList;

public interface IBankAccount {
    ArrayList getTransactions();

    String getName();

    float getBalance();

    void deposit (float amount, LocalDate of);

    void withdraw (float amount, LocalDate of);


}
