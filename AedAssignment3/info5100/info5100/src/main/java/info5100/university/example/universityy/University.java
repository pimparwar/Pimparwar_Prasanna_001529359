package info5100.university.example.universityy;

import info5100.university.example.Department.Department;
import info5100.university.example.Employer.EmployerDirectory;
import info5100.university.example.Persona.Admin.Admin;

import java.util.ArrayList;
import java.util.Scanner;

public class University {

    ArrayList<Department> departmentList;
    String universityName;
    Admin admin;

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public University(String universityName) {
        this.universityName = universityName;
        departmentList = new ArrayList<>();
    }

    public ArrayList<Department> getDepartmentList() {
        return departmentList;

    }

    public void setDepartmentList(ArrayList<Department> departmentList) {
        this.departmentList = departmentList;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void addDepartment(Department dp) {
        departmentList.add(dp);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        printMainMenu();

        boolean quit = false;
        while (!quit) {
            System.out.println("Enter As :");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    boolean lk = false;
                    while (!lk) {
                        System.out.println("Enter Admin id:");
                        String id = scanner();
                        System.out.println("Enter Password:");
                        String password = scanner();

                        if (passwordmatcher(id, password)) {
                            System.out.println("yo yo yo jesse pinkman in the house");
                            //check student industry rating
                            //add 7 company in arraylist


                            Department department = new Department("department");
                            EmployerDirectory employerDirectory = new EmployerDirectory(department);
                            employerDirectory.newEmployerProfile("Google");
                            employerDirectory.newEmployerProfile("Amazon");
                            employerDirectory.newEmployerProfile("Facebook");

                            lk = true;
                        } else {
                            System.out.println("please Enter Correct Credentials and try again:/n");
                        }
                    }
                    //admin.adminStart();
                    lk = true;
                    break;
                case 2:
                    int k = printDepartmens();

                    boolean blk = false;
                    while (!blk) {


                        System.out.println("Enter Student id:");
                        String id = scanner();
                        System.out.println("Enter Password:");
                        String password = scanner();

                        if (departmentList.get(k - 1).getStudentDirectory().findStudent(id) == null) {

                            System.out.println("please Enter Correct Credentials and try again:/n");
                        } else {


                            printStudentMenu(departmentList.get(k - 1));
                            lk = true;
                        }
                    }

                    //addEncountertoExsistingPatient();
                    break;
                case 3:
                    // printPatientDirectory();
                    boolean lblk = false;
                    while (!lblk) {
                        System.out.println("Enter Faculty id:");
                        String id = scanner();
                        System.out.println("Enter Password:");
                        String password = scanner();

                        if (passwordmatcher(id, password)) {
                            System.out.println("yo yo yo jesse pinkman in the house");
                            lk = true;
                        } else {
                            System.out.println("please Enter Correct Credentials and try again:/n");
                        }
                    }
                    break;

                case 4:
                    lk = true;
                    break;

                case 5:
                    printMainMenu();
                    break;

            }
        }

    }

    public void printMainMenu() {
        System.out.println("""
                Welcome To NEU Portal
                press
                1-Admin
                2-Student
                3-Faculty
                4-Exit.
                5-To reprint menu""");

    }

    public int printDepartmens() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Select Departrment:");
        for (int i = 0; i < departmentList.size(); i++) {
            System.out.println(i + 1 + ". " + departmentList.get(i).getDepartmentName());
        }
        System.out.println("");
        return sc.nextInt();
    }

    public boolean passwordmatcher(String id, String password) {

        if (admin.getName().equals(id)) {
            return admin.getPassword().equals(password);
        } else {
            return false;
        }

    }

    public void printStudentMenu(Department dp) {
        Scanner scanner = new Scanner(System.in);

        printStudentOptions();

        boolean quit = false;
        while (!quit) {

            System.out.println("Students Options: (press 5 to reprint the menu 6 to exit)");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // registeringthroughdepartmet()
                    System.out.println("yo yo yo jessi pinkman in the house");
                    break;
                case 2:
                    // addEncountertoExsistingPatient();
                    break;
                case 3:
                    //  printPatientDirectory();
                    break;

                case 4:
                    // printPersonDirectory();
                    break;

                case 5:
                    printStudentOptions();
                    break;

                case 6:
                    quit = true;
                    break;


            }
        }
    }

    public void printStudentOptions() {
        System.out.println("""
                1-Register for the new course
                2-Get Grades
                3-Get GPA
                4-Exit.
                5-To reprint menu""");
    }

    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
