package info5100.university.example.Persona.Admin;

import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Person;

public class Admin {
    Person person;

    public Admin(Person person) {
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
