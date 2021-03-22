/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.Persona.EmploymentHistory.EmploymentHistroy;
import java.util.HashMap;

/**
 *
 * @author kal bugrara
 */
public class StudentProfile {

    Person person;
    Transcript transcript;
    EmploymentHistroy employmenthistory;
    

    public StudentProfile(Person p) {

        person = p;
        transcript = new Transcript();
        employmenthistory = new EmploymentHistroy();
    }

    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public CourseLoad getCourseLoadBySemester(String semester) {

        return transcript.getCourseLoadBySemester(semester);
    }

    public CourseLoad getCurrentCourseLoad() {

        return transcript.getCurrentCourseLoad();
    }

    public CourseLoad newCourseLoad(String s){
        
        return transcript.newCourseLoad(s);
    }
    
     public HashMap<String, CourseLoad>  fetchcourselistfromtranscript(){
          return transcript.courseloadlist;
     }
     
//       public void  setGrades(String semester,CourseOffer co,int marks){
//       
//       
//           if(transcript.courseloadlist.get(semester).getSeatassignments().get(i).getSeat().getCourseoffer().equals(co)){
//               transcript.courseloadlist.get(semester).getSeatassignments().get(i).setMarks(marks);
//               System.out.println("success..");
//           } else {
//           }
//           }
       
       

//       public void pppp(String semester){
//           
//           System.out.println(" ll"+transcript.courseloadlist.get(semester).getSeatassignments().get(0).);
//           System.out.println("jjhj");
//       }
        
   
       
       public String getStudentName(){
       return person.getPersonName();
       }
       
       public String getStudentPassword(){
       return person.getPassword();
       }
       
       public void setPassword(String pp){
        person.setPassword(pp);
       }
       
       public String getStudentid(){
       return person.getPersonId();
       }
       
          public CourseLoad checkCourseLoadAvail(String sem){
    
        return transcript.checkCourseLoadAvail(sem);
    
    }
    }

 
    
     
    
//    public int setGradeForTeacher(String coursename){
//         transcript.currentcourseload.
//    }

