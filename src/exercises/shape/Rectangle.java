package exercises.shape;

/**
 * Created by chris on 7/25/17.
 */
public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle() {
        this(3, 5);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.area = width * height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        this.area = width * this.height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        this.area = this.width * height;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
