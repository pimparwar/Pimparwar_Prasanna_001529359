/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicApp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Clinic {

    ArrayList<Patient> patientDirectory = new ArrayList<Patient>();
    City boston = new City("Boston");

    public Clinic() {
    }

    public void Start() {

        Scanner scanner = new Scanner(System.in);

        printMainMenu();

        boolean quit = false;
        while (!quit) {
            System.out.println("Enter ur choice: press 8 to print main menu again & 7 to exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addNewPatientToDirectory();
                    break;
                case 2:
                    addEncountertoExsistingPatient();
                    break;
                case 3:
                    printPatientDirectory();
                    break;

                case 4:
                    printPersonDirectory();
                    break;

                case 5:
                    System.out.println("To calculate the total number people in the community with blood pressure that is abnormal ");
                    boston.printCommunityList();
                    System.out.println("Enter community number:");
                    int zipcode = scanner.nextInt();
                    boston.communityList.get(zipcode - 1).listOfAbnormalPatiens("systolicbp");
                    break;

                case 6:
                    boston.printCommunityList();
                    System.out.println("To calculate the total number of abnormal people in the community ");
                    boston.printCommunityList();
                    System.out.println("Enter community number:");
                    int zipcode1 = scanner.nextInt();
                    boston.communityList.get(zipcode1 - 1).listOfToatlAbnormalPatiens();
                    break;

                case 7:
                    quit = true;
                    break;

                case 8:
                    printMainMenu();
                    break;

            }
        }
    }

    public void printPatientDirectory() {
        {

            int n = patientDirectory.size();
            System.out.println("--------------------------------------------------------------\n"
                    + "PATIENT DIRECTORY                                             \n"
                    + "---------------------------------------------------------------");

            for (int i = 0; i < n; i++) {
                System.out.println((i + 1) + ". " + patientDirectory.get(i).getPersonName() + "   " + patientDirectory.get(i).getMobileNumber());
            }

            System.out.println("--------------------------------------------------------------");
        }
    }

    public void printPersonDirectory() {
        {

            int n = patientDirectory.size();
            System.out.println("-------------------------------------------------------------------------------------\n"
                    + "PERSON DIRECTORY                                                                     \n"
                    + "-------------------------------------------------------------------------------------");

            for (int i = 0; i < n; i++) {
                System.out.println((i + 1) + ". " + patientDirectory.get(i).toString());
            }

            System.out.println("---------------------------------------------------------------------------------------");
        }
    }

    public void addNewPatientToDirectory() {
        //System.out.println("---------------------------------------------------------------------");
        int kage;
        System.out.println("");
        System.out.println("Let Start....");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);
        String patientName = null;
        String mobileNumber = null;

        System.out.println("Enter Patient's Name:");

        boolean quit = false;
        while (!quit) {

            patientName = scanner.nextLine();

            if (isStringAlphabet(patientName)) {
                quit = true;
            } else {
                System.out.println("please only enter characters");
            }
        }
        System.out.println("Enter Patient's Age:");
        do {

            while (!scanner.hasNextInt()) {
                System.out.println("Please enter numeric value characters not allowed in age!");
                scanner.next();
            }
            kage = scanner.nextInt();
        } while (kage <= 0);
        int age = kage;

        while (quit) {
            System.out.println("Enter Patient's Mobile Number:");

            mobileNumber = scanne();

            if (isMobileNumber(mobileNumber)) {
                int n = numberAlreadyExist(mobileNumber);

                if (n == -1) {
                    quit = false;
                }

            } else {
                System.out.println("please only enter 10 digits and must start from 6-9 try again:");
            }

        }

        System.out.println("Enter Patient's Residence details:");

        Community ck = boston.addCommunityToCity();
        House house1 = ck.addNewHouseToCommunity();

        Patient john = new Patient(patientName, age, mobileNumber, house1);
        house1.addPatientInHouse(john);

        System.out.println("Enter Patient's Vital Signs");
        john.newEncounter();
        patientDirectory.add(john);

        System.out.println("");

    }

    public void printMainMenu() {
        System.out.println("Avalible actions:\npress\n"
                + "1-Add new Patient.\n"
                + "2-Add Encounter to exsisting Patient.\n"
                + "3-Patient Directory.\n"
                + "4-Person Directory.\n"
                + "5-to calculate no.of patient in community with abnormal blood pressure.\n"
                + "6-to calculate no.of patient in community with abnormal.\n"
                + "7-Exit.\n"
                + "8-To reprint menu");

    }

    public static boolean isStringAlphabet(String string) {
        return ((!string.equals(""))
                && (string != null)
                && (string.matches("^[a-zA-Z ]*$")));
    }

    public static boolean isZipCode(String zipcode) {
        return ((!zipcode.equals(""))
                && (zipcode != null)
                && (zipcode.matches("^[0-9]{5}$")));
    }

    public static boolean isMobileNumber(String number) {
        return ((!number.equals(""))
                && (number != null)
                && (number.matches("^[1-9]{1}[0-9]{9}$")));
    }

    public void checkPatienAlreadyExist() {
    }

    public static String scanne() {
        Scanner scanner = new Scanner(System.in);
        String sk = scanner.nextLine();
        return sk;
    }

    private int numberAlreadyExist(String mobileNumber) {
        for (int i = 0; i < patientDirectory.size(); i++) {

            {
                if (patientDirectory.get(i).getMobileNumber() == null ? mobileNumber == null : patientDirectory.get(i).getMobileNumber().equals(mobileNumber)) {
                    System.out.println("Enterd number is linked to " + patientDirectory.get(i).getPersonName());
                    return i;
                }
            }

        }
        return -1;
    }

    private void addEncountertoExsistingPatient() {

        System.out.println("Enter Patients Mobile Number:");
        String mobileNumber11 = scanne();
        if (numberAlreadyExist(mobileNumber11) == -1) {
            System.out.println("This Patient dosent exist.");
        } else {
            System.out.println("For Patient -> " + patientDirectory.get(numberAlreadyExist(mobileNumber11)).getPersonName());

            avalibleOptions(patientDirectory.get(numberAlreadyExist(mobileNumber11)));

        }
    }

    public static void printActions() {
//          System.out.println("---------------------------------------------------------------------");
        System.out.println("Avalible options are:                    ");
//            System.out.println("---------------------------------------------------------------------");

        System.out.println("");
        System.out.println("1 - to check patient is normal?.");
        System.out.println("2 - to check patients current vital signs.");
        System.out.println("3 - to add new patient encounter.");
        System.out.println("4 - to view patients encounter history.");
        System.out.println("5 - to know patients vital sign is normal or not?");
        System.out.println("6 - Exit.");
        System.out.println("9 - To view options again");
        System.out.println("");
//          System.out.println("---------------------------------------------------------------------");
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
                    patient.newEncounter();
                    break;
                case 4:
                    patient.viewPatientEncounterHistory();
                    break;
                case 5:
                    System.out.println("type patients vitals sign you want to know about?\n(heartrate,systolicbp,respiratoryrate,weight(kg)),weight(pounds)");

                    if (patient.isThisVitalSignNormal(scanne())) {
                        System.out.println("Normal-in range");
                    } else {
                        System.out.println("Ab Normal-not in range");
                    }
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

}
