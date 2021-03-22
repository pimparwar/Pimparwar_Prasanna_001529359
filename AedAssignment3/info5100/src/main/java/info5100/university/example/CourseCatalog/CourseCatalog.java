package info5100.university.example.CourseCatalog;

import info5100.university.example.Department.Department;

import java.util.ArrayList;

public class CourseCatalog {
    Department department;
    ArrayList<Course> courseList;

    public CourseCatalog(Department d) {
        courseList = new ArrayList();
        department = d;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public Course newCourse(String courseName, String courseNumber, int credits) {
        Course course = new Course(courseName, courseNumber, credits);
        courseList.add(course);
        return course;
    }

    public Course getCourseByNumber(String n) {
        for (Course c : courseList) {
            if (c.getCourseNumber().equals(n)) return c;
        }
        return null;
    }

}