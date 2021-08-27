package bankerPack;

import java.util.Comparator;

public class DateSorter implements Comparator<Transaction> {

    @Override
    public int compare(Transaction o1, Transaction o2) {
        if (o2.getPrintDate().equals(o1.getPrintDate())) {
            return -1;
        }
        return o2.getDate().compareTo(o1.getDate());
    }
}
