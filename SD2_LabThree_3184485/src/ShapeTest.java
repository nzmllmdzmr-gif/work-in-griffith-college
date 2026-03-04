/**
 Name: Zihan Wang
 Student Number: 3184485
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ShapeTest {

    private double epsilon = 0.1;

    @Test
    public void testCircle() {
        Circle c = new Circle("Circle", 3);

        assertEquals(28.27, c.area(), epsilon);
        assertEquals(18.84, c.perimeter(), epsilon);
        assertTrue(c.toString().contains("Circle"));
    }
}