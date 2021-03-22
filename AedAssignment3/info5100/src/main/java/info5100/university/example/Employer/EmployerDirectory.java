/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Employer;

import info5100.university.example.Department.Department;

import java.util.ArrayList;

/**
 * @author kal bugrara
 */
public class EmployerDirectory {

    Department department;
    ArrayList<EmployerProfile> employerList;

    public EmployerDirectory(Department department) {
        this.department = department;
        employerList = new ArrayList();
    }

    public void newEmployerProfile(String name) {
        EmployerProfile employerProfile = new EmployerProfile(name);
        employerList.add(employerProfile);
    }

    public EmployerProfile findTeachingFaculty(String id) {
        for (EmployerProfile ep : employerList) {
            if (ep.isMatch(id)) {
                return ep;
            }
        }
        return null;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ArrayList<EmployerProfile> getEmployerList() {
        return employerList;
    }

    public void setEmployerList(ArrayList<EmployerProfile> employerList) {
        this.employerList = employerList;
    }
}
