package exercises;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chris on 6/19/17.
 */
public class HashMapLoop {

    public static void main(String[] args) {

        // create a HashMap
        HashMap<String, Object> map = new HashMap<>();

        // add some items to the map
        map.put("firstName", "Blake");
        map.put("lastName", "Johnson");
        map.put("age", 30);
        map.put("idNumber", "1010");

        // iterate over the HashMap
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
