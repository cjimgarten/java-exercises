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

    // equals
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Course)) {
            return false;
        }

        Course c = (Course) obj;

        if (c.getInstructor().equals(this.instructor) &&
                c.getName() == this.name &&
                c.getCourseId() == this.courseId &&
                c.getRoster() == this.roster) {
            return true;

        }

        return false;
    }

    // main
    public static void main(String[] args) {
        Student s1 = new Student("Jon", 1);
        Student s2 = new Student("Jon", 1);
        Student s3 = new Student("Jan", 1);
        Student s4 = s1;
        System.out.println(s1.equals(s1));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }

}
