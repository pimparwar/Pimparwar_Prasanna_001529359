/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
      private ArrayList<Restaurant> restaurantDirectory;
    
    public RestaurantDirectory() {
        restaurantDirectory = new ArrayList();
    }

    public ArrayList<Restaurant> getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(ArrayList<Restaurant> restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }
    
    public Restaurant newRestaurant(String restaurantName, String restaurantAddress, String managerName, String phoneNumber) {
        Restaurant r = new Restaurant(restaurantName, restaurantAddress, managerName, phoneNumber);
        restaurantDirectory.add(r);
     //   System.out.println(restaurantDirectory.size() + "New Res");
        return r;
    }
    
    public void removeRestaurant(Restaurant r){
        restaurantDirectory.remove(r);
    }
    
    public Restaurant getRestaurant(String restaurantName) {
        for(Restaurant r : restaurantDirectory) {
            if(r.getRestaurantName().equals(restaurantName)) {
                return r;
            }
        }
        return null;
    }
    
}
