package org.launchcode.java.studios;

import java.util.Scanner;

/**
 * Created by chris on 6/12/17.
 */
public class Area {

    public static void main(String[] args) {

        // create a Scanner object
        Scanner in = new Scanner(System.in);

        // prompt the user for a radius
        double r;
        do {
            System.out.print("Enter a radius: ");
            r = in.nextDouble();
        } while (r < 0.0);

        // calculate and display the area
        double A = 3.14 * r * r;
        System.out.println("The area of a circle of radius " + r + " is: " + A);
    }
}
