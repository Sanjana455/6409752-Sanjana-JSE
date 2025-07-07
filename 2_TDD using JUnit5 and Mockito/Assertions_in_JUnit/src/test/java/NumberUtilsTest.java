import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsTest {

    @Test
    void shouldReturnTrueForPrimeNumber() {
        assertTrue(NumberUtils.isPrime(7), "Expected 7 to be prime");
    }

    @Test
    void shouldReturnFalseForNonPrime() {
        assertFalse(NumberUtils.isPrime(8), "Expected 8 to be not prime");
    }

    @Test
    void shouldHandleEdgeCaseOne() {
        assertFalse(NumberUtils.isPrime(1), "1 is not a prime number");
    }
}
