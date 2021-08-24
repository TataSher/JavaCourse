package bankerPack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    @Test
    void testCreateBankAccountWithName() {
        BankAccount account1 = new BankAccount("Kumbajan Aubergino");
        String result = account1.showName();
        assertEquals("Kumbajan Aubergino", result);
    }

    @Test
    void testCreateBankAccountWithBalance() {
        BankAccount account1 = new BankAccount("Kumbajan Aubergino");
        Integer result = account1.showBalance();
        assertEquals(0, result);
    }

}
