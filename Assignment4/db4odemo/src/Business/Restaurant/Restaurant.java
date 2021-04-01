/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Menu.Menu;
import Business.Menu.MenuDirectory;

/**
 *
 * @author harold
 */
public class Restaurant {
     private String restaurantName;
    private String restaurantAddress;
    private String managerName;
    private String phoneNumber;
    private Menu Menu;

    public Restaurant(String restaurantName, String resAddress, String managerName, String phoneNumber) {
        this.restaurantName = restaurantName;
        this.restaurantAddress = resAddress;
        this.managerName = managerName;
        this.phoneNumber = phoneNumber;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Menu getMenu() {
        return Menu;
    }

    public void setMenu(Menu Menu) {
        this.Menu = Menu;
    }
    
     @Override
    public String toString() {
        return restaurantName;
    }
}
