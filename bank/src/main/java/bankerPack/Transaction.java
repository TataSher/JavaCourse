package bankerPack;

public class Transaction {
    private Integer amount;
    private String date;

    public Transaction(Integer amount) {
        this.amount = amount;
        this.date = "24-08-2021";
    }
    public Integer showAmount() {
        return amount;
    }
    public String showDate() {
        return date;
    }
}
