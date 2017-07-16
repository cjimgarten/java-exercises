package exercises.school;

import java.util.ArrayList;

/**
 * Created by chris on 7/11/17.
 */
public class Course {

    // fields
    private String instructor;
    private String name;
    private int courseId;
    private ArrayList<Student> roster;

    // constructor
    public Course(String instructor, String name, int courseId, ArrayList<Student> roster) {
        this.instructor = instructor;
        this.name = name;
        this.courseId = courseId;
        this.roster = roster;
    }

    // getters and setters
    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public ArrayList<Student> getRoster() {
        return roster;
    }

    public void setRoster(ArrayList<Student> roster) {
        this.roster = roster;
    }

    // to string
    @Override
    public String toString() {
        return "Course{" +
                "instructor='" + instructor + '\'' +
                ", name='" + name + '\'' +
                ", courseId='" + courseId + '\'' +
                ", roster=" + roster +
                '}';
    }

}
