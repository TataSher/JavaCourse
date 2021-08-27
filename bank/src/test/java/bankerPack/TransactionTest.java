package bankerPack;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionTest {

    @Test
    void testCreateTransaction() {
        Transaction deposit1 = new Transaction(100, LocalDate.of(2021, 8, 27));
        float result = deposit1.getAmount();
        assertEquals(100, result);
    }
    @Test
    void testTransactionWithDate() {
        Transaction deposit2 = new Transaction(200, LocalDate.of(2021, 8, 27));
        String result = deposit2.getPrintDate();
        assertEquals("27/08/2021", result);
    }

}
