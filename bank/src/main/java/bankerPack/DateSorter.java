package bankerPack;

import java.util.Comparator;

public class DateSorter implements Comparator<Transaction> {

    @Override
    public int compare(Transaction o1, Transaction o2) {
        if (o2.getDate() == o1.getDate()) {
            return 0;
        }
        return o2.getDate().compareTo(o1.getDate());
    }
}
