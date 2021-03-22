/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

/**
 * @author kal bugrara
 */
public class Person {

    String id;
    String password;
    String personName;

    public Person(String id, String password, String personName) {
        this.id = id;
        this.password = password;
        this.personName = personName;
    }

    public String getPersonId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public boolean isMatch(String id) {
        return getPersonId().equals(id);
    }

    public boolean isMatchPassword(String password) {
        return getPassword().equals(password);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
}
