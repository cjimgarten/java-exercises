package exercises;

/**
 * Created by chris on 6/19/17.
 */
public class ArrayExample {

    public static void main(String[] args) {

        // create an array
        int[] arr = {1, 1, 2, 3, 5, 8};

        // use a for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // line break
        System.out.println("\n");

        // use a foreach loop
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
