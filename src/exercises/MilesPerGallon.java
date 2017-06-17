package exercises;

import java.util.Scanner;

/**
 * Created by chris on 6/12/17.
 */
public class MilesPerGallon {

    public static void main(String[] args) {

        // create a Scanner object
        Scanner in = new Scanner(System.in);

        // prompt the user for miles driven and gas consumed
        System.out.print("Miles driven: ");
        double miles = in.nextDouble();
        System.out.print("Gallons consumed: ");
        double gallons = in.nextDouble();

        // calculate and display miles per gallon
        double mpg = miles / gallons;
        System.out.println("MPG: " + mpg);
    }
}
