import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsTest {

    @Test
    void testPrime() {
        assertTrue(NumberUtils.isPrime(7));
    }

    @Test
    void testNotPrime() {
        assertFalse(NumberUtils.isPrime(8));
    }

    @Test
    void testEdgeCase() {
        assertFalse(NumberUtils.isPrime(1));
    }
}
