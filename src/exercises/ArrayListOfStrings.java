package exercises;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by chris on 6/19/17.
 */
public class ArrayListOfStrings {

    public static void main(String[] args) {

        // create ArrayList and Scanner objects
        ArrayList<String> words = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        // populate the list with Strings
        while (true) {
            System.out.print("Enter a word (Enter 'q' to continue): ");
            String word = in.next();

            if (word.equals("q")) {
                break;
            }

            words.add(word);
        }

        // print words in the list with 5 letters
        printWordsWithFiveLetters(words);
    }

    public static void printWordsWithFiveLetters(ArrayList<String> words) {

        // iterate over the list and print words with 5 letters
        for (String word : words) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }
}
