/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

/**
 *
 * @author kal bugrara
 */
public class SeatAssignment {
    
    Seat seat;
    CourseLoad courseload;
    int marks=90;
    
    
    public SeatAssignment(Seat s){
        seat = s;
       // courseload = cl;
    }
        public SeatAssignment(){

    }
    public void assignSeatToStudent(CourseLoad cl){
        courseload = cl;
    }
    
    

    public Seat getSeat() {
        return seat;
    }
    
    public String getCourseid(){
    return seat.courseoffer.course.getCOurseNumber();
    }
    
    public String getCourseName(){
    return seat.courseoffer.course.getName();
    }
    
       public void setMarks(int marks2) {
        this.marks = marks2;
    }

    public int getMarks() {
        return marks;
    }
    
}
