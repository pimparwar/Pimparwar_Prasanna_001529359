/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicApp;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class TestClass {

    public static void main(String[] args) {

        MainClass mainClass = new MainClass();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Now we have 5 different patients and each of them have 3 different vital signs lets take a look:");
        System.out.println("");
        Community ck=new Community("Roxbury","02120");
        
        House house1=new House("1575 Tremont St.");
        House house2=new House("3000 Heaven St.");
        
        
        ck.addHouse(house2);
        ck.addHouse(house1);
        
        
        
        Patient john = new Patient("john D Cascov",0,"85522999",house1);
        Patient ram = new Patient("Ram David kr.", 1,"85593399",house2);
        Patient raj = new Patient("Raj Tarun Bhatia", 4,"85449999",house2);
        Patient tom = new Patient("Tom Toaster jr.", 7,"85599559",house1);
        Patient marcella = new Patient("Marcella Brown", 15,"85566999",house1);
        
        

        VitalSigns vs = new VitalSigns(25, 85, 85, 12);
        VitalSigns vs1 = new VitalSigns(35, 125, 55, 3);  // heart rate john(0Y) is only taken lower here for newbornbaby
        VitalSigns vs2 = new VitalSigns(36, 34, 34, 13);
        VitalSigns vs3 = new VitalSigns(25, 70, 60, 5);   // added to Ram(1Y) heart rate and bp are lower 
        VitalSigns vs4 = new VitalSigns(43, 73, 53, 16);
        VitalSigns vs5 = new VitalSigns(25, 75, 85, 12);  // added to Tom(7Y) 
        VitalSigns vs6 = new VitalSigns(63, 43, 33, 11);
        VitalSigns vs7 = new VitalSigns(25, 85, 85, 15);  // added to raj(4Y) everything is normal 
        VitalSigns vs8 = new VitalSigns(63, 43, 33, 19);
        VitalSigns vs9 = new VitalSigns(35, 125, 55, 3); //22, 110, 125, 60 accoding to marcella(15Y) adolscent everything is greater than normal 

        john.addEncounter(vs);
        john.addEncounter(vs4);
        john.addEncounter(vs2);
        john.addEncounter(vs7);
        john.addEncounter(vs9);
        john.addEncounter(vs1);

        ram.addEncounter(vs2);
        ram.addEncounter(vs1);
        ram.addEncounter(vs3);
        ram.addEncounter(vs2);
        ram.addEncounter(vs3);

        tom.addEncounter(vs3);
        tom.addEncounter(vs1);
        tom.addEncounter(vs4);
        tom.addEncounter(vs2);
        tom.addEncounter(vs5);

        raj.addEncounter(vs4);
        raj.addEncounter(vs5);
        raj.addEncounter(vs6);
        raj.addEncounter(vs3);
        raj.addEncounter(vs7);

        marcella.addEncounter(vs7);
        marcella.addEncounter(vs8);
        marcella.addEncounter(vs2);
        marcella.addEncounter(vs9);
        
        house1.addPatientInHouse(marcella);
        house1.addPatientInHouse(ram);
        house2.addPatientInHouse(raj);
        house2.addPatientInHouse(tom);
        house1.addPatientInHouse(john);
        
       
        
        
        ck.listOfAbnormalPatiens("systolicbp");
        
       

        System.out.println("");
        
        
    
        }
        }

    


  



