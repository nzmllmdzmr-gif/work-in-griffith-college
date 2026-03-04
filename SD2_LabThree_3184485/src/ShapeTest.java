/**
 Name: Zihan Wang
 Student Number: 3184485
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ShapeTest {

    private double epsilon = 0.1;

    //add Circle unit test
    @Test
    public void testCircle() {
        Circle c = new Circle("Circle", 3);

        assertEquals(28.27, c.area(), epsilon);
        assertEquals(18.84, c.perimeter(), epsilon);
        assertTrue(c.toString().contains("Circle"));
    }
    //add Rhombus unit test

    @Test
    public void testRhombus() {
        Rhombus r = new Rhombus("Rhombus", 6, 8, 5);

        assertEquals(24, r.area(), epsilon);
        assertEquals(20, r.perimeter(), epsilon);
        assertTrue(r.toString().contains("Rhombus"));

    }
    @Test
    public void testTriangle() {
        RightAngledTriangle t = new RightAngledTriangle("Triangle", 3, 4, 5);

        assertEquals(6, t.area(), epsilon);
        assertEquals(12, t.perimeter(), epsilon);
        assertTrue(t.toString().contains("Triangle"));
    }
}
