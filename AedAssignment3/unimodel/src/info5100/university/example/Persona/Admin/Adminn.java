/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.Admin;

import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Person;

/**
 *
 * @author admin
 */
public class Adminn {
    Person person;

    public Adminn(Person person) {
        this.person = person;
    }
    
    public Department addDepartment(String depName){
     Department department = new Department(depName);
     return department;
    }
    
    public String getName(){
    return person.getPersonId();
    }
    
    public String getPassword(){
    return person.getPassword();
    }
}
