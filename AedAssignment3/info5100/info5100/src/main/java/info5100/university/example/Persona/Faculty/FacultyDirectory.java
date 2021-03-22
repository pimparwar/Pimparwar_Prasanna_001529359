/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.Faculty;

import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Person;

import java.util.ArrayList;

public class FacultyDirectory {

    Department department;
    ArrayList<FacultyProfile> teacherList;

    public FacultyDirectory(Department d) {
        department = d;
        teacherList = new ArrayList();
    }

    public void newFacultyProfile(Person p) {
        FacultyProfile facultyProfile = new FacultyProfile(p);
        teacherList.add(facultyProfile);
    }

    public FacultyProfile findTeachingFaculty(String id) {
        for (FacultyProfile sp : teacherList) {
            if (sp.isMatch(id)) {
                return sp;
            }
        }
        return null; //not found after going through the whole list
    }

}
