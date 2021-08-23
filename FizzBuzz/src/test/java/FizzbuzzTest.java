import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzTest {
    @Test
    void testGenerateListsNumbersUpToOne() {
        Fizzbuzz subject = new Fizzbuzz();
        String result = subject.generate(1);
        assertEquals("1", result);
    }

    @Test
    void testGenerateListsNumbersUpToTwo() {
        Fizzbuzz subject = new Fizzbuzz();
        String result = subject.generate(2);
        assertEquals("1, 2", result);
    }
    @Test
    void testGenerateListsNumbersUpToThree() {
        Fizzbuzz subject = new Fizzbuzz();
        String result = subject.generate(3);
        assertEquals("1, 2, Fizz", result);
    }
}