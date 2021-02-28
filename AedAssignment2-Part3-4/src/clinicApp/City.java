/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicApp;


import static clinicApp.Clinic.isStringAlphabet;
import static clinicApp.Clinic.isZipCode;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class City {
    private String cityName;
    public  ArrayList<Community> communityList;

    public City(String cityName) {
        this.cityName = cityName;
        communityList =new ArrayList<Community>();
    }

    City() {
       
    }
    
    
   
     public int checkCommunityAlreadyExist(String zipcode){
     
       
         for(int i=0;i<communityList.size();i++){
               if(communityList.get(i).getZipCode() == null ? zipcode == null : communityList.get(i).getZipCode().equals(zipcode)){
                   return i;
               } else {   
               }   
         }
         return -1;
         }
    
    public Community addCommunityToCity()
    {
        
        
    Scanner scanner=new Scanner(System.in);
       System.out.println("Community:"); 
       String community=null;
        boolean quit = false;
        while (!quit) {

            community = scanner.nextLine();

            if (isStringAlphabet(community)) {
                quit = true;
            } else {
                System.out.println("please only enter characters only");
            }
        }
       
       System.out.println("Zip Code:");
       String zipCode=null;
         while (quit) {

             zipCode= scanner.nextLine();

            if (isZipCode(zipCode)) {
                quit = false;
            } else {
                System.out.println("please only enter 5 digit zipcode try again:");
            }
         }
       
       if(checkCommunityAlreadyExist(zipCode)==-1){
            Community ck=new Community(community,zipCode);
           communityList.add(ck);
           
            return ck;
       } else{
                System.out.println("Community Already Exist in City");
                return communityList.get(checkCommunityAlreadyExist(zipCode)); 
       }
    } 
    
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
         public void printCommunityList() {
        
        System.out.println("------------------------");
         for(int i=0;i<communityList.size();i++){
             System.out.println((i+1)+". "+communityList.get(i).getZipCode()+" "+communityList.get(i).getCommunityName());
         }
         System.out.println("-------------------------");
    }
}
