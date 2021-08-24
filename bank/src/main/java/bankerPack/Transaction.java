package bankerPack;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private Integer amount;
    private LocalDate date = LocalDate.now();


    public Transaction(Integer amount) {
        this.amount = amount;
        this.date = date;
    }
    public Integer showAmount() {
        return amount;
    }
    public String showDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return date.format(formatter);
    }
}
