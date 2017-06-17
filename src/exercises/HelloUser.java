package exercises;

import java.util.Scanner;

/**
 * Created by chris on 6/12/17.
 */
public class HelloUser {

    public static void main(String[] args) {

        // create a Scanner object and prompt the user for their name
        Scanner in = new Scanner(System.in);
        System.out.println("Your name: ");
        String name = in.nextLine();

        // say hello
        System.out.println("Hello, " + name);
    }
}
