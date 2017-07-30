package exercises.shape;

/**
 * Created by chris on 7/25/17.
 */
public class Program {

    public static void main(String[] args) {

        AbstractEntity circle = new Circle();
        Shape rect = new Rectangle();
        Square square = new Square();

        System.out.println(circle.getId());
        System.out.println(rect.getArea());
        System.out.println(square.getHeight());
    }

}
