/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.universityy.University;

/**
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        University uni = new University("NEU");


        Department d1 = new Department("College of Proffesional Studies");
        Department department = new Department("College Of Engineering");

        uni.addDepartment(d1);
        uni.addDepartment(department);

        Course course = department.newCourse("AED", "info 5100", 4);
        Course course2 = department.newCourse("ENCP", "ENCP 6000", 1);

        CourseSchedule courseschedule = department.newCourseSchedule("Fall2020");

        CourseOffer courseoffer = courseschedule.newCourseOffer("info 5100");
        CourseOffer courseoffer2 = courseschedule.newCourseOffer("ENCP 6000");


        courseoffer.generatSeats(10);
        courseoffer2.generatSeats(10);


//        PersonDirectory pd = department.getPersonDirectory();
        //   Person person = pd.newPerson("0112303");
        //  Person person2 = pd.newPerson("222");

        StudentDirectory sd = department.getStudentDirectory();

        //     StudentProfile student = sd.newStudentProfile(person);
        //   StudentProfile student2= sd.newStudentProfile(person2);


        //   CourseLoad courseload = student.newCourseLoad("Fall2020");
        //  CourseLoad cl = student2.newCourseLoad("Fall2020");


//       
//     courseload.registerStudent(courseload.newSeatAssignment(courseoffer));   
//         //register student in class and new seat assigning for assignment
//       cl.registerStudent(cl.newSeatAssignment(courseoffer));
//       
//       cl.registerStudent(cl.newSeatAssignment(courseoffer2));
//       
//       

        // student2.setGrades("Fall2020",courseoffer, 95);
        // student2.setGrades("Fall2020",courseoffer2,97);


        // student2.getGrades("Fall2020");
        //   student2.pppp("Fall2020");

        uni.printDepartmens();


        int total = department.calculateRevenuesBySemester("Fall2020");
        System.out.println("Total: " + total);


    }

}
