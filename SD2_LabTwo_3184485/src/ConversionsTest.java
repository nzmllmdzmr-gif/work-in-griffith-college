/**
 Name: Zihan Wang
 Student Number: 3184485
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversionsTest {
    Conversions conv = new Conversions();

    @Test
    public void testStringToInteger() {
        assertEquals(123, conv.stringToInteger("123"));
        assertEquals(0, conv.stringToInteger("0"));
        assertEquals(-50, conv.stringToInteger("-50"));
    }
}