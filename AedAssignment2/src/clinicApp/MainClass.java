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
public class MainClass {

    public static void main(String[] args) {
        
        
        
        
        //System.out.println("---------------------------------------------------------------------");
        System.out.println("Please fill out patients Name, Age \nand Vital Signs for the record.\n"
                + "Refer the information below for the Age\n"
                + "New born   - 0 years\n"
                + "Infant     - 1 years\n"
                + "Toddler    - 1-3 years\n"
                + "PreSchooler- 3-5 years\n"
                + "SchoolAge  - 6-12 years\n"
                + "Adolescent - 13+ years\n");
     // System.out.println("---------------------------------------------------------------------");
       
        System.out.println("Let Start........");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Patients Name:");
        String patientName = scanner.nextLine();

        System.out.println("Enter Patients Age:");
        int age = scanner.nextInt();

        Patient prasanna = new Patient(patientName, age);

        System.out.println("Enter Patients Vital Signs");
        prasanna.newVitalSigns();

        
        System.out.println("");

        //  boolean kkk = isPatientNormal(prasanna);
        //  System.out.println("patient is normal: " + kkk);
        //viewPatientHistory();
        avalibleOptions(prasanna);
    }

    public static void avalibleOptions(Patient patient) {
        
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        printActions();
        while (!quit) {
            
            System.out.println("");
            System.out.println("Enter your choice: (press 9 to view options again)");
            int choice = scanner.nextInt();

            System.out.println("");
            switch (choice) {

                case 1:
                    if (patient.isPatientNormal()) {
                        System.out.println("-> Patient is Normal");
                    } else {
                        System.out.println("-> Patient is Not Normal");
                    }

                    break;

                case 2:
                    patient.currentVitalSigns();
                    break;
                case 3:
                    patient.newVitalSigns();
                    break;
                case 4:
                    patient.viewPatientHistory();
                    break;
                case 5:
                    System.out.println("type patients vitals sign you want to know about?\n(heartrate,systolicbp,respiratoryrate,weight(kg)),weight(pounds)");
                    
                    
                     
                   if(patient.isThisVitalSignNormal(scanne())){
                       System.out.println("Normal-in range");
                   }else{System.out.println("Ab Normal-not in range");}
                    break;
                case 6:
                    quit = true;
                    break;
                case 9:
                    printActions();
                    break;

                default:
                    break;

            }
        }
    }
public static String scanne(){
Scanner scanner = new Scanner(System.in);
String sk=scanner.nextLine();
return sk;
}

public static void printActions(){
//          System.out.println("---------------------------------------------------------------------");
            System.out.println("Avalible options are:                    ");
//            System.out.println("---------------------------------------------------------------------");
           
           
            System.out.println("");
            System.out.println("1 - to check patient is normal?.");
            System.out.println("2 - to check patients current vital signs.");
            System.out.println("3 - to add new vital signs.");
            System.out.println("4 - to view patients history.");
            System.out.println("5 - to know patients vital sign is normal or not?");
            System.out.println("6 - Exit.");
            System.out.println("9 - To view options again");
            System.out.println("");
//          System.out.println("---------------------------------------------------------------------");
}
}
