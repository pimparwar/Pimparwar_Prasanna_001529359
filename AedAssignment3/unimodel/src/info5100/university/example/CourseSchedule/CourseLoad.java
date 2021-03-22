/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import info5100.university.example.Department.Department;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CourseLoad {

    String semester;
    ArrayList<SeatAssignment> seatassignments;

    public CourseLoad(String s) {
        seatassignments = new ArrayList<>();
        semester = s;
    }

    public SeatAssignment newSeatAssignment(CourseOffer co) {

        Seat seat = co.getEmptySeat(); // seat linked to courseoffer
        if (seat == null) {
            return null;
        }
        SeatAssignment sa = seat.newSeatAssignment();
        seatassignments.add(sa);  //add to students course 
        return sa;
    }

    public void registerStudent(SeatAssignment sa) {

        sa.assignSeatToStudent(this);
        seatassignments.add(sa);
    }

    public ArrayList<SeatAssignment> getSeatassignments() {
        return seatassignments;
    }

    public void setSeatassignments(ArrayList<SeatAssignment> seatassignments) {
        this.seatassignments = seatassignments;
    }

    public SeatAssignment getSeatAssignThroughCourseOffer(CourseOffer co) {
        for (int i = 0; i < seatassignments.size(); i++) {
            if (seatassignments.get(i).seat.courseoffer.equals(co)) {
                return seatassignments.get(i);
            } else {
            }

        }
        return null;
    }
    
    public void printScorecard(){
        System.out.println("---------"+semester+"---------");
        for (int i = 0; i < seatassignments.size(); i++) {
            System.out.println((i+1)+". "+seatassignments.get(i).getCourseName()+"    -->    "+seatassignments.get(i).marks);
    }
        System.out.println("---------------------------");
    }
    
   
    
    public int calculateTotalMarks(){
      int nk=0;
      int i=0;
      for (i = 0; i < seatassignments.size(); i++) {
                nk=nk+seatassignments.get(i).marks;
  }
      return nk/i;
  }
    
    public void assigngrades(String coursenumber,int jj){
    for(int i=0;i<seatassignments.size();i++){
               if(seatassignments.get(i).getCourseid().equals(coursenumber)){
               seatassignments.get(i).setMarks(jj);
               } 
    }
    }
}
