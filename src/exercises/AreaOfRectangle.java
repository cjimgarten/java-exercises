package exercises;

import java.util.Scanner;

/**
 * Created by chris on 6/12/17.
 */
public class AreaOfRectangle {

    public static void main(String[] args) {

        // create a Scanner object
        Scanner in = new Scanner(System.in);

        // prompt the user for dimensions
        System.out.print("Width: ");
        double w = in.nextDouble();
        System.out.print("Height: ");
        double h = in.nextDouble();

        // calculate and display the area
        double A = w * h;
        System.out.println("Area: " + A);
    }
}
