package exercises;

import java.util.ArrayList;

/**
 * Created by chris on 6/19/17.
 */
public class SumOfEvenNums {

    public static void main(String[] args) {

        // create an ArrayList object
        ArrayList<Integer> numbers = new ArrayList<>();

        // populate the list with numbers
        for (int i = 0; i < 10; i++) {
            numbers.add(i + 1);
        }

        // get and display the sum of even numbers in the list
        int sumOfEvens = getSumOfEvens(numbers);
        System.out.println(sumOfEvens);
    }

    public static int getSumOfEvens(ArrayList<Integer> numbers) {

        // iterate over the list and calculate the sum of even numbers
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}
