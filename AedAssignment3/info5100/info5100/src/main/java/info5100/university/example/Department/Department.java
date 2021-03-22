/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Department;

import com.github.javafaker.Faker;
import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;

import java.util.HashMap;

/**
 * @author kal bugrara
 */
public class Department {

    String name;
    CourseCatalog coursecatalog;
    StudentDirectory studentdirectory;
    FacultyDirectory facultyDirectory;
    HashMap<String, CourseSchedule> mastercoursecatalog;

    public Department(String departmentName) {
        name = departmentName;
        mastercoursecatalog = new HashMap<String, CourseSchedule>();

        studentdirectory = new StudentDirectory(this); //pass the department object so it stays linked to it
        facultyDirectory = new FacultyDirectory(this);
        coursecatalog = new CourseCatalog(this);
        Faker faker = new Faker();

        int studentCount = faker.number().numberBetween(2, 9);
        System.out.println(studentCount+" Student Details:");
        for (int i = 0; i < studentCount; i++) {
            String firstName = faker.name().name();
            String password = faker.internet().password(4, 6);
            Person person = new Person(firstName, password, firstName);
            boolean isEmployed = faker.bool().bool();
            studentdirectory.newStudentProfile(person, isEmployed);
             
            System.out.println(firstName);
        }
        System.out.println("");
        int facultyCount = faker.number().numberBetween(3, 8);
        System.out.println(facultyCount+" Faculty Details:");
        for (int i = 0; i < facultyCount; i++) {
            String firstName = faker.name().name();
            String password = faker.internet().password(4, 6);
            Person person = new Person(firstName, password, firstName);
            facultyDirectory.newFacultyProfile(person);
            System.out.println("Faculty:"+ firstName);
        }
        System.out.println("");

        int courseCount = faker.number().numberBetween(3, 6);
        System.out.println(courseCount + " Courses provided");
        for (int i = 0; i < courseCount; i++) {
            String course = faker.educator().course();
            int courseNumber = faker.number().numberBetween(10, 50);
            int credits = faker.number().numberBetween(1, 5);
            coursecatalog.newCourse(course, course + courseNumber, credits);
            System.out.println(course);
        }
        System.out.println("");
    }

    public String getDepartmentName() {
        return name;
    }

    public StudentDirectory getStudentDirectory() {
        return studentdirectory;
    }

    public StudentProfile getStudentProfile(String s) {
        return null;
    }

    public CourseSchedule newCourseSchedule(String semester) {
        CourseSchedule cs = new CourseSchedule(semester, coursecatalog);
        mastercoursecatalog.put(semester, cs);
        return cs;
    }

    public CourseSchedule getCourseSchedule(String semester) {
        return mastercoursecatalog.get(semester);
    }

    public CourseCatalog getCourseCatalog() {
        return coursecatalog;
    }

    public Course newCourse(String n, String nm, int cr) {
        return coursecatalog.newCourse(n, nm, cr);
    }

    public int calculateRevenuesBySemester(String semester) {
        CourseSchedule css = mastercoursecatalog.get(semester);
        return css.calculateTotalRevenues();
    }

    public void RegisterForAClass(String studentid, String cn, String semester) {
        StudentProfile sp = studentdirectory.findStudent(studentid);
        CourseLoad cl = sp.getCurrentCourseLoad();
        CourseSchedule cs = mastercoursecatalog.get(semester);
        CourseOffer co = cs.getCourseOfferByNumber(cn);
        co.assignEmptySeat(cl);
    }
}
