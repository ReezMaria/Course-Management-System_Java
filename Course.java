import java.io.*;

// Course class to represent a course
public class Course {

    private String courseId;
    private String courseName;
    private int courseDuration; // in hours
    private double courseFee = 50d;

    // to get and set courseId
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    // to get and set courseName
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // to get and set courseDuration
    public int getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    // to get and set courseFee
    public double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    // constructor to initialize details
    public Course(String courseId, String courseName, int courseDuration) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDuration = courseDuration;
    }

    // Display details
    public void displayCourseDetails() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Duration: " + courseDuration + " hours");
        System.out.println("Fee per hour: $" + courseFee);
    }

    // fee calculation
    public double feeCalculation() {
        double totalFee = courseDuration * courseFee;
        return totalFee;
    }

    // Student class
    public static class Student {

        private String studentId;
        private String studentName;

        // constructor
        Student(String studentId, String studentName) {
            this.studentId = studentId;
            this.studentName = studentName;
        }

        // enroll method
        public void enrollInCourse(Course course) {
            System.out.println(studentName +
                    " enrolled in course: " +
                    course.getCourseName());
        }
    }

    // main method
    public static void main(String[] args) {

        Course c1 = new Course("C101", "Java Programming", 20);

        Student s1 = new Student("S101", "Reez");

        c1.displayCourseDetails();

        double total = c1.feeCalculation();

        System.out.println("Total Course Fee: $" + total);

        s1.enrollInCourse(c1);
    }
}