package exercises;

import java.util.ArrayList;

/**
 * Created by chris on 6/19/17.
 */
public class ArrayListLoop {

    public static void main(String[] args) {

        // create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // add some items to the list
        list.add("Kurt");
        list.add("Steve");
        list.add("Emily");
        list.add("Jess");

        // iterate over the ArrayList
        for (String item : list) {
            System.out.println(item);
        }
    }
}
