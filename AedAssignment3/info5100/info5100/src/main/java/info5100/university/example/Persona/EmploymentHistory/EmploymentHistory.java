/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.EmploymentHistory;

import java.util.ArrayList;

/**
 * @author kal bugrara
 */
public class EmploymentHistory {
    ArrayList<Employment> employments;

    public EmploymentHistory() {
        employments = new ArrayList();
    }

    public void newEmployment(String job, Integer quality ) {
        Employment ne = new Employment(quality, job);
        employments.add(ne);
    }

}
