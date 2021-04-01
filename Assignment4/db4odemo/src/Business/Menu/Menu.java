/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;


/**
 *
 * @author prasanna
 */
public class Menu {
    
    private String foodName;
    private String restaurantName;
    private Double foodItemPrice;

    public Menu(String foodName, String restaurantName, Double foodItemPrice) {
        this.foodName = foodName;
        this.restaurantName = restaurantName;
        this.foodItemPrice = foodItemPrice;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Double getFoodItemPrice() {
        return foodItemPrice;
    }

    public void setFoodItemPrice(Double foodItemPrice) {
        this.foodItemPrice = foodItemPrice;
    }


   
    }

   
    

