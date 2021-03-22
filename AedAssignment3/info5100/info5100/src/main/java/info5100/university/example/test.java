package info5100.university.example;

import com.github.javafaker.Faker;
import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.Department.Department;
import info5100.university.example.Employer.EmployerDirectory;
import info5100.university.example.Employer.EmployerProfile;
import info5100.university.example.Persona.Admin.Admin;
import info5100.university.example.Persona.Person;
import info5100.university.example.universityy.University;

import java.util.ArrayList;

public class test {


    public static void main(String[] args) {

        Faker faker = new Faker();

        ArrayList<University> universities = new ArrayList<University>();

        for (int i = 0; i < 3; i++) {
            String universityName = faker.university().name();

            University university = new University(universityName);
            String personName = faker.name().name();
            String password = faker.internet().password(4, 6);
            Person person = new Person(personName, password, personName);
            Admin admin = new Admin(person);
            university.setAdmin(admin);
            
            System.out.println(i + ":" + "University Name:"+ universityName);
            System.out.println();
            for (int i1 = 0; i1 < 3; i1++) {
                String campus = faker.educator().campus();
                Department department = new Department(campus);
                university.addDepartment(department);
                 System.out.println("Department:"+ campus);

                 EmployerDirectory employerDirectory = new EmployerDirectory(department);
                for (int i2 = 0; i2 < 5; i2++) {
                    String name = faker.name().name();
                    employerDirectory.newEmployerProfile(name);
                    System.out.println("Employer Name:"+ name);
                    
                }
                
                System.out.println();

            }

            universities.add(university);
        }
        System.out.println("");
        
        
        
        
        System.out.println("Does GPA matter report starts here");
        int repeat = faker.number().numberBetween(5, 10);
        for(int i=0;i<repeat;i++){
            int count=faker.number().numberBetween(2, 4);
            int id=faker.number().numberBetween(100, 600);
            double gpa= faker.number().randomDouble(1, 1, 4);
            
            System.out.println("");
            
            System.out.println("Student ID:" + id);
            for(int j=0;j<count;j++){
                   int rating=faker.number().numberBetween(1, 10);
        ArrayList<String> companies= new ArrayList<>();
        String c1= faker.company().name();
        String c2= faker.company().name();
        String c3= faker.company().name();
        String c4= faker.company().name();
        String c5= faker.company().name();
        companies.add(c1);
        companies.add(c2);
        companies.add(c3);
        companies.add(c4);
        companies.add(c5);
        
            System.out.println("Company Name: "+c1 + "\t"+ "Rating: "+ rating + "\t" + "GPA"+ gpa);
            }
            
        }
        System.out.println("");
        System.out.println("University Rankings report starts here");
        System.out.println("");
        
        for(int i1=0;i1<repeat;i1++){
        int id= faker.number().numberBetween(100, 600);
        int total=faker.number().numberBetween(600, 1000);
        String dep=faker.university().name();
        boolean status=faker.bool().bool();
        int count= faker.number().numberBetween(10, 40);
        System.out.println("Total Student Count \t Employed Student Count \t    University Name");
        System.out.println(total + "\t \t \t \t"+id + "\t\t"  + dep );
        
        }
        
        System.out.println("");
        System.out.println("College Rankings report starts here");
        System.out.println("");
        
        String cName= faker.university().name();
        for(int i3=0;i3<repeat;i3++){
        String coName= faker.educator().course();
        int id= faker.number().numberBetween(100, 600);
        int total=faker.number().numberBetween(600, 1000);
        
        System.out.println("Total Student Count \t Employed Student Count \t\t    University Name \t\t\t College Name");
        System.out.println(total + "\t \t \t \t"+id + "\t\t\t"  + cName + "\t\t\t" + coName );
        }
        
    }

}
