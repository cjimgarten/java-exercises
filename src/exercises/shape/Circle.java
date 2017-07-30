package exercises.shape;

/**
 * Created by chris on 7/25/17.
 */
public class Circle extends Shape {

    private static final double PI = 3.14;

    private double radius;

    public Circle() {
        this(1);
    }

    public Circle(double radius) {
        this.radius = radius;
        this.area = PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.area = PI * radius * radius;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
