/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.Seat;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Admin.Adminn;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.universityy.University;

/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        University uni=new University("NEU");
        Person a1 = new Person("Prasanna Pimparwar","prasanna.p","1234");
        Adminn admin = new Adminn(a1);
        uni.setAdmin(admin);

        Department d1=new Department("College of Proffesional Studies");
        Department department = new Department("College Of Engineering");

        uni.addDepartment(d1);
        uni.addDepartment(department);
        
        Course course = department.newCourse("AED", "info 5100", 4);
        Course course2 = department.newCourse("ENCP","ENCP 6000", 1);

        CourseSchedule courseschedule = department.newCourseSchedule("Fall2020");

        CourseOffer courseoffer = courseschedule.newCourseOffer("info 5100");
        CourseOffer courseoffer2 = courseschedule.newCourseOffer("ENCP 6000");
        
        
        courseoffer.generatSeats(10);
        courseoffer2.generatSeats(10);
       
    
        
        
        PersonDirectory pd = department.getPersonDirectory();
        Person person = pd.newPerson("Prasanna","111","123");
        Person person2 = pd.newPerson("Mohit","222","123");
        Person person3 = pd.newPerson("Professor Ajinkya", "555", "1234");
        
        StudentDirectory sd = department.getStudentDirectory();
        FacultyDirectory fd = department.getFacultydirectory();
        
      StudentProfile student = sd.newStudentProfile(person);
        StudentProfile student2= sd.newStudentProfile(person2);
        FacultyProfile fc= fd.newStudentProfile(person3);
        
        
        
        CourseLoad courseload = student.newCourseLoad("Fall2020");
        CourseLoad cl = student2.newCourseLoad("Fall2020");
         
        courseoffer2.AssignAsTeacher(fc);
        
        
       
     // SeatAssignment sa = new SeatAssignment(courseload, seat);
     //  courseload.registerStudent(sa);
     courseload.newSeatAssignment(courseoffer);
       
       // SeatAssignment sa2 = new SeatAssignment(cl, seat2);
      // courseload.registerStudent(sa2);
//register student in class and new seat assigning for assignment
 cl.newSeatAssignment(courseoffer);
    
   //cl.registerStudent(cl.newSeatAssignment(courseoffer2));
   cl.newSeatAssignment(courseoffer2);
//      
       
       
   // student2.setGrades("Fall2020",courseoffer, 95);
    //  student2.setGrades("Fall2020",courseoffer2,97);
      
      
     // student2.getGrades("Fall2020");
     // student2.pppp("Fall2020");
    
        System.out.println(student.getCourseLoadBySemester("Fall2020").getSeatAssignThroughCourseOffer(courseoffer).getCourseName());
      uni.start();
        
       // int total = department.calculateRevenuesBySemester("Fall2020");
      //  System.out.println("Total: " + total);
        

    }

}
