/**
 Name: Zihan Wang
 Student Number: 3184485
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversionsTest {
    Conversions conv = new Conversions();

    @Test
    public void testDollarToEuro() {
        // Positive
        assertEquals(100.0, conv.dollarToEuro(108.0), 0.001);
        // 0
        assertEquals(0.0, conv.dollarToEuro(0.0), 0.001);
        // Negative
        assertEquals(-1.0, conv.dollarToEuro(-1.08), 0.001);
    }
}