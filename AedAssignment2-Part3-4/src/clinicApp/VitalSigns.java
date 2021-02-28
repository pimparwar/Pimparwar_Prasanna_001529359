/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicApp;


import java.text.DecimalFormat;
import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;


/**
 *
 * @author admin
 */
public class VitalSigns {

    private int respiratoryRate;
    private int heartRate;
    private int systolicBP;
    private int weightKg;
    private double weightinPounds;
    
    DecimalFormat dfc = new DecimalFormat("#.#");
//private static date vsdate=new date();
    //DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
    

  

    public VitalSigns(int respiratoryRate, int heartRate, int systolicBP, int weight) {
        this.respiratoryRate = respiratoryRate;
        this.heartRate = heartRate;
        this.systolicBP = systolicBP;
        this.weightKg = weight;
        this.weightinPounds=weight*2.2;
       
        
      //  this.dateAndTime=LocalDateTime.now();
 
        
    }

    public VitalSigns() {
       
    }
    
    public VitalSigns(VitalSigns vs){
     this.respiratoryRate = vs.respiratoryRate;
        this.heartRate = vs.heartRate;
        this.systolicBP = vs.systolicBP;
        this.weightKg = vs.weightKg;
        this.weightinPounds=vs.weightKg*2.2;
       
    }

//    public String setDateAndTime() {
//        
//        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//          return dateAndTime.format(format);
//    }


        

     

    public double getWeightinPounds() {
        return weightinPounds;
    }

    public void setWeightinPounds(double weightinPounds) {
        this.weightinPounds = weightinPounds;
    }


    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getSystolicBP() {
        return systolicBP;
    }

    public void setSystolicBP(int systolicBP) {
        this.systolicBP = systolicBP;
    }

    public int getWeightKg() {
        return weightKg; 
    }

    public void setWeightKg(int weightKg) {
        this.weightKg = weightKg;
    }

    @Override
    public String toString() {
        return "respiratoryRate:" + respiratoryRate + ", heartRate:" + heartRate + ", systolicBP:" + systolicBP + ", weight(kg):" + weightKg+ ", weight(pounds):" + dfc.format(weightinPounds);
    }


 
    
    

}
