/**
 Name: Zihan Wang
 Student Number: 3184485
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

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
    @Test
    public void testIntegration() {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle("Circle", 3));
        shapes.add(new Circle("Circle", 4));

        shapes.add(new Rhombus("Rhombus", 6, 8, 5));
        shapes.add(new Rhombus("Rhombus", 10, 12, 7));

        shapes.add(new RightAngledTriangle("Triangle", 3, 4, 5));
        shapes.add(new RightAngledTriangle("Triangle", 5, 12, 13));

        for (Shape s : shapes) {
            assertTrue(s.area() > 0);
            assertTrue(s.perimeter() > 0);
        }
    }
}
