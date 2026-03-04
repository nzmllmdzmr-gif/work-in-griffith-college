/**
 Name: Zihan Wang
 Student Number: 3184485
 */

public class Rhombus extends Shape {

    private double d1;
    private double d2;
    private double side;

    public Rhombus(String name, double d1, double d2, double side) {
        super(name);
        this.d1 = d1;
        this.d2 = d2;
        this.side = side;
    }

    @Override
    public double area() {
        return (d1 * d2) / 2;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return super.toString() + " d1:" + d1 + " d2:" + d2;
    }
}