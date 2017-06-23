package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by chris on 6/20/17.
 */
public class IDsAndStudentsHashMap {

    public static void main(String[] args) {

        // create HashMap and Scanner objects
        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);

        // populate the map with students
        while (true) {
            System.out.print("Enter an ID (Enter -1 to continue): ");
            int id = in.nextInt();

            if (id == -1) {
                break;
            }

            System.out.print("Enter a student (Enter 'q' to continue): ");
            String newStudent = in.next();

            if (newStudent.equals("q")) {
                break;
            }

            students.put(id, newStudent);
        }

        // print the map
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("id: " + student.getKey() + ", student: " + student.getValue());
        }
    }
}
