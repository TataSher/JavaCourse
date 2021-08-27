package bankerPack;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private float amount;
    private LocalDate date;
    private String kind;

    public Transaction(float amount, LocalDate of) {
        this.amount = amount;
        this.date = of;
    }
    public float getAmount() {
        return amount;
    }

    public String getKind() {
        if (amount > 0) {
            this.kind = "deposit";
        } else if (amount < 0) {
            this.kind = "withdrawal";
        }
        return kind;
    }

    public String getDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatter);
    }


}
