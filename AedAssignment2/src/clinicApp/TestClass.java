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

        Patient john = new Patient("john D Cascov", 0);
        Patient ram = new Patient("Ram David kr.", 1);
        Patient raj = new Patient("Raj Tarun Bhatia", 4);
        Patient tom = new Patient("Tom Toaster jr.", 7);
        Patient marcella = new Patient("Marcella Brown", 15);

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

        john.addVitalSigns(vs);
        john.addVitalSigns(vs4);
        john.addVitalSigns(vs2);
        john.addVitalSigns(vs7);
        john.addVitalSigns(vs9);
        john.addVitalSigns(vs1);

        ram.addVitalSigns(vs2);
        ram.addVitalSigns(vs1);
        ram.addVitalSigns(vs3);
        ram.addVitalSigns(vs2);
        ram.addVitalSigns(vs3);

        tom.addVitalSigns(vs3);
        tom.addVitalSigns(vs1);
        tom.addVitalSigns(vs4);
        tom.addVitalSigns(vs2);
        tom.addVitalSigns(vs5);

        raj.addVitalSigns(vs4);
        raj.addVitalSigns(vs5);
        raj.addVitalSigns(vs6);
        raj.addVitalSigns(vs3);
        raj.addVitalSigns(vs7);

        marcella.addVitalSigns(vs7);
        marcella.addVitalSigns(vs8);
        marcella.addVitalSigns(vs2);
        marcella.addVitalSigns(vs9);
        
        System.out.println(john.isPatientNormal());
        

        System.out.println("");
        
        
        boolean quit =false;
       while(!quit){
        System.out.println("Choose Patient:\n"
                + "1.John (new born baby)\n"
                + "2.Ram  (infant)\n"
                + "3.Tom  (school age)\n"
                + "4.Raj  (preeschool)\n"
                + "5.Marcella(adolescent)\n"
                + "To Exit press 6\n");

        
        
            
            int n = scanner.nextInt();
        

        switch (n) {
            case 1:
                mainClass.avalibleOptions(john);
                break;

            case 2:
                mainClass.avalibleOptions(ram);
                break;
            case 3:
                mainClass.avalibleOptions(tom);
                break;
            case 4:
                mainClass.avalibleOptions(raj);
                break;
            case 5:
                mainClass.avalibleOptions(marcella);
                break;
                
            case 6:
                quit= true;
                break;
                
                default:
                    break;
        }
        }

    }

}
