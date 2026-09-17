import student.Student;
import course.Course;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(101, "Arun", "CSE");
        Course course = new Course(201, "Object Oriented Programming", 4);

        student.displayDetails();
        course.displayDetails();
    }
}
