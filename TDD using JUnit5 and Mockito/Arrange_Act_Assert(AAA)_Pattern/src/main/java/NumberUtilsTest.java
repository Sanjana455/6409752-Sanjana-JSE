import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsTest {

    int primeNumber;
    int nonPrimeNumber;
    int edgeCase;

    @BeforeEach
    void setUp() {
        primeNumber = 7;
        nonPrimeNumber = 8;
        edgeCase = 1;
    }

    @Test
    void shouldReturnTrueForPrimeNumber() {
        boolean result = NumberUtils.isPrime(primeNumber);

        assertTrue(result, "7 is a prime number, so this should return true");
    }

    @Test
    void shouldReturnFalseForNonPrimeNumber() {
        boolean result = NumberUtils.isPrime(nonPrimeNumber);

        assertFalse(result, "8 is divisible by 2 and 4, so not prime");
    }

    @Test
    void shouldReturnFalseForEdgeCaseOne() {
        boolean result = NumberUtils.isPrime(edgeCase);

        assertFalse(result, "1 is not considered a prime number");
    }
}
