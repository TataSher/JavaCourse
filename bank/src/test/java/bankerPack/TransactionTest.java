package bankerPack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionTest {

    @Test
    void testCreateTransaction() {
        Transaction deposit1 = new Transaction(100);
        Integer result = deposit1.showAmount();
        assertEquals(100, result);
    }
    @Test
    void testTransactionWithDate() {
        Transaction deposit2 = new Transaction(200);
        String result = deposit2.showDate();
        assertEquals("26-08-2021", result);
    }

    @Test
    void testTransactionBalance() {
        Transaction deposit2 = new Transaction(200);
        deposit2.addBalance(200);
        Integer result = deposit2.showBalance();
        assertEquals(200, result);
    }
}
