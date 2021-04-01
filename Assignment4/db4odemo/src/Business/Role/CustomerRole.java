/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Menu.MenuDirectory;
import Business.Order.OrderDirectory;

import Business.Organization;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import userinterface.CustomerRole.CustomerAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author prasanna
 */

public class CustomerRole extends Role{
  
    
    
   

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, RestaurantDirectory restaurantDirectory, CustomerDirectory customerDirectory, MenuDirectory menuDirectory, DeliveryManDirectory deliveryManDirectory, OrderDirectory orderDirectory) {
       return new CustomerAreaJPanel(business,userProcessContainer, account,   restaurantDirectory, deliveryManDirectory,customerDirectory, menuDirectory, orderDirectory);
    }
    
    
}