/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Customer.Customer;

import Business.Menu.Menu;
import Business.Restaurant.Restaurant;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author prasanna
 */
public class Order extends WorkRequest{
   
    private String orderId;
    private String orderStatus;
    private Restaurant orderRestaurant;
    private Customer orderCustomer;
    private String orderDeliveryMan;
     private Menu menu;
    private int itemQuantity;
    private String orderResult;
    private boolean orderAssign;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Restaurant getOrderRestaurant() {
        return orderRestaurant;
    }

    public void setOrderRestaurant(Restaurant orderRestaurant) {
        this.orderRestaurant = orderRestaurant;
    }

    public Customer getOrderCustomer() {
        return orderCustomer;
    }

    public void setOrderCustomer(Customer orderCustomer) {
        this.orderCustomer = orderCustomer;
    }

    public String getOrderDeliveryMan() {
        return orderDeliveryMan;
    }

    public void setOrderDeliveryMan(String orderDeliveryMan) {
        this.orderDeliveryMan = orderDeliveryMan;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

        
    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getOrderResult() {
        return orderResult;
    }

    public void setOrderResult(String orderResult) {
        this.orderResult = orderResult;
    }

    public boolean isOrderAssign() {
        return orderAssign;
    }

    public void setOrderAssign(boolean orderAssign) {
        this.orderAssign = orderAssign;
    }
    
    
}
