/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.Persona.Admin.Admin;
import info5100.university.example.Persona.Person;
import info5100.university.example.universityy.University;

/**
 * @author admin
 */
public class maintrial {
    public static void main(String[] args) {

        Person a1 = new Person("prasanna", "1234", "prasanna");
        Admin admin = new Admin(a1);
        University university = new University("North Eastern University");
        university.setAdmin(admin);
        university.start();

    }


}
