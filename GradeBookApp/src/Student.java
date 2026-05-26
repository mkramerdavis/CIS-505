/*
 * Student.java
 * Represents a student with their course and grade information.
 */
public class Student {

    private String firstName;
    private String lastName;
    private String course;
    private String grade;
    private String comments;

    // Default Constructor. //
    public Student() {

    }

    // Parameterized Constructor
    public Student(String firstName,
                   String lastName,
                   String course,
                   String grade,
                   String comments) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.grade = grade;
        this.comments = comments;
    }

    // Getters and Setters.//
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
    // toString Method. //
    @Override
    public String toString() {

        return "First Name: " + firstName +
               "\nLast Name: " + lastName +
               "\nCourse: " + course +
               "\nGrade: " + grade +
               "\nComments: " + comments;
    }
}