/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import com.github.javafaker.Faker;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.Persona.EmploymentHistory.EmploymentHistory;

/**
 * @author kal bugrara
 */
public class StudentProfile {

    Person person;
    Transcript transcript;
    EmploymentHistory employmentHistory;
    boolean isEmployed;

    public StudentProfile(Person p, boolean isEmployed) {
        person = p;
        transcript = new Transcript();
        employmentHistory = new EmploymentHistory();

        Faker faker = new Faker();
        if (isEmployed){
            int employmentHistoryCount = faker.number().numberBetween(1, 7);
            for (int i = 0; i < employmentHistoryCount; i++) {
                int quality = faker.number().numberBetween(1, 11);
                String position = faker.job().position();
                employmentHistory.newEmployment(position, quality);
            }
        }
        this.isEmployed = isEmployed;
    }

    public boolean isMatch(String id) {
        return person.getPersonId().equals(id);
    }

    public CourseLoad getCourseLoadBySemester(String semester) {
        return transcript.getCourseLoadBySemester(semester);
    }

    public CourseLoad getCurrentCourseLoad() {
        return transcript.getCurrentCourseLoad();
    }

    public CourseLoad newCourseLoad(String s) {
        return transcript.newCourseLoad(s);
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    public EmploymentHistory getEmploymentHistory() {
        return employmentHistory;
    }

    public void setEmploymentHistory(EmploymentHistory employmentHistory) {
        this.employmentHistory = employmentHistory;
    }

    public boolean getIsEmployed() {
        return isEmployed;
    }

    public void setIsEmployed(boolean isEmployed) {
        this.isEmployed = isEmployed;
    }

    //     public void  getGrades(){
//        
//     for(int i=0;i<10;i++){
//  
//        for(int j=0;j<transcript.courseloadlist..getSeatassignments().size();j++){
//            System.out.println(transcript.courseloadlist.get(semester).getSeatassignments().get(j).getSeat().getMarks()+" --> "+
//                    transcript.courseloadlist.get(semester).getSeatassignments().get(j).getSeat().getCourseName());
//        }
//        
//     }
//    }

    public void setGrades(String semester, CourseOffer co, int marks) {

        for (int i = 0; i < 10; i++) {
            if (transcript.courseloadlist.get(semester).getSeatassignments().get(i).getSeat().getCourseoffer().equals(co)) {
                transcript.courseloadlist.get(semester).getSeatassignments().get(i).setMarks(marks);
                System.out.println("success..");
            } else {
            }
        }

    }

    public void pppp(String semester) {
        System.out.println(" ll" + transcript.courseloadlist.get(semester).getSeatassignments().get(0));
        System.out.println("jjhj");
    }

}

//    public int setGradeForTeacher(String coursename){
//         transcript.currentcourseload.
//    }

