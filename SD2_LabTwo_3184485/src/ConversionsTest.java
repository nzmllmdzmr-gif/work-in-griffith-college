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
        // 测试 1: 正数 (假设汇率 1.08，108美元应换回100欧元)
        assertEquals(100.0, conv.dollarToEuro(108.0), 0.001);
        // 测试 2: 零
        assertEquals(0.0, conv.dollarToEuro(0.0), 0.001);
        // 测试 3: 负数
        assertEquals(-1.0, conv.dollarToEuro(-1.08), 0.001);
    }

    @Test
    public void testStringToInteger() {
        assertEquals(123, conv.stringToInteger("123"));
        assertEquals(0, conv.stringToInteger("0"));
        assertEquals(-50, conv.stringToInteger("-50"));
    }

    @Test
    public void testIntegerToString() {
        assertEquals("500", conv.integerToString(500));
        assertEquals("0", conv.integerToString(0));
        assertEquals("-10", conv.integerToString(-10));
    }

    @Test
    public void testSwitchCase() {

        assertEquals("aBc", conv.switchCase("AbC"));
        assertEquals("HELLO", conv.switchCase("hello"));
        assertEquals("123", conv.switchCase("123"));
    }
}