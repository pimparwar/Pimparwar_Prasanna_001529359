/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

/**
 *
 * @author kal bugrara
 */
public class Person {
    
    String id;
    String password;
    String name;

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Person (String name,String id,String password){
        
        this.id = id;
           this.password=password;
           this.name=name;
    }
    public String getPersonId(){
        return id;
    }
    
    public String getPersonName(){
            return name;
    }
    
    public String getPassword(){
    return password;
    }

        public boolean isMatch(String id){
        if(getPersonId().equals(id)) return true;
        return false;
    }
    
        public boolean isMatchPassword(String password){
        if(getPassword().equals(password)) return true;
        return false;
    }
}
