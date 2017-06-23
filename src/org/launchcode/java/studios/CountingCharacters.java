package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by chris on 6/22/17.
 */
public class CountingCharacters {

    public static void main(String[] args) {

        // create a Scanner object
        Scanner in = new Scanner(System.in);

        // prompt the user for a string and convert to uppercase characters
        System.out.print("Sentence: " );
        String testString = in.nextLine();
        testString = testString.toUpperCase();

        // create a HashMap to store the amount of characters in a string
        HashMap<Character, Integer> map = new HashMap<>();

        // count the characters
        int newVal;
        for (char c : testString.toCharArray()) {

            if (!Character.isAlphabetic(c)) {
                continue;
            }

            if (map.containsKey(c)) {
                newVal = map.get(c) + 1;
                map.put(c, newVal);
            } else {
                map.put(c, 1);
            }
        }

        // print the map
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
