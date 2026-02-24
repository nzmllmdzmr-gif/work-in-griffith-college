/**
 Name: Zihan Wang
 Student Number: 3184485
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversionsTest {
    Conversions conv = new Conversions();

    @Test
    public void testEuroToDollar() {
        // Positive number
        assertEquals(108.0, conv.euroToDollar(100.0), 0.001);
        // 0
        assertEquals(0.0, conv.euroToDollar(0.0), 0.001);
        // Negative number
        assertEquals(-1.08, conv.euroToDollar(-1.0), 0.001);
    }
}