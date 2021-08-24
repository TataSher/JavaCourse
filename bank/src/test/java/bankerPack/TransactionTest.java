package bankerPack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionTest {

    @Test
    void testAddDepositOne() {
        Transaction deposit1 = new Transaction(100);
        Integer result = deposit1.showAmount();
        assertEquals(100, result);
    }
}
