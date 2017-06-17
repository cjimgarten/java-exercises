package exercises;

import java.util.Scanner;

/**
 * Created by chris on 6/12/17.
 */
public class Alice {

    public static void main(String[] args) {

        // store the first sentence of Alice's Adventures in Wonderland
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister " +
                "on the bank, and of having nothing to do: once or twice she had peeped into the" +
                " book her sister was reading, but it had no pictures or conversations in it," +
                " 'and what is the use of a book,' thought Alice 'without pictures or " +
                "conversation?'";

        // convert the sentence to uppercase characters
        firstSentence = firstSentence.toUpperCase();

        // create a Scanner object and prompt the user for a search term
        Scanner in = new Scanner(System.in);
        System.out.println("Term to search for:");
        String term = in.nextLine();

        // convert the term to uppercase characters
        term = term.toUpperCase();

        // check if the term is contained in sentence and display the result
        boolean contained = firstSentence.contains(term);
        System.out.println(contained);

    }
}
