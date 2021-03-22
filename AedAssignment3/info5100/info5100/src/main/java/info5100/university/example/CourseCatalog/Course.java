package info5100.university.example.CourseCatalog;

public class Course {
    String number;
    String name;
    int credits;
    int price = 1500; //per credit hour

    public String getName() {
        return name;
    }

    public Course(String courseName, String courseNumber, int credits) {
        name = courseName;
        number = courseNumber;
        this.credits = credits;
    }

    public String getCourseNumber() {
        return number;
    }

    public int getCoursePrice() {
        return price * credits;

    }
}
