package bankerPack;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private Integer amount;
    private LocalDate date = LocalDate.now();
    private String kind;

    public Transaction(Integer amount) {
        this.amount = amount;
    }
    public Integer showAmount() {
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

    public String showDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return date.format(formatter);
    }
}
