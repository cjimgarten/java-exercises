package exercises.school;

/**
 * Created by chris on 7/11/17.
 */
public class Student {

    // fields
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    // constructors
    public Student(String name, int studentId) {
        this(name, studentId, 0, 0.0);
    }

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // add a grade
    public void addGrade(double points, double credits) {
        double qualityScore = points * credits;
        this.numberOfCredits += credits;
        double totalQualityScore = (this.gpa * this.numberOfCredits) + qualityScore;
        this.gpa = (totalQualityScore) / (this.numberOfCredits);
    }

    // get the students grade level
    public String getGradeLevel() {
        String  gradeLevel;
        if (this.numberOfCredits < 30) {
            gradeLevel = "Freshman";
        } else if (this.numberOfCredits < 60) {
            gradeLevel = "Sophmore";
        } else if (this.numberOfCredits < 90) {
            gradeLevel = "Junior";
        } else {
            gradeLevel = "Senior";
        }
        return gradeLevel;
    }

    // to string
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", numberOfCredits=" + numberOfCredits +
                ", gpa=" + gpa +
                '}';
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) {
            return false;
        }

        Student s = (Student) obj;

        if (s.getName().equals(this.name) &&
                s.getStudentId() == this.studentId &&
                s.getNumberOfCredits() == this.numberOfCredits &&
                s.getGpa() == this.gpa) {
            return true;

        }

        return false;
    }

}
