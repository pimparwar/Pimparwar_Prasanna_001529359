/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author prasanna
 */
public class OrderDirectory {
   
    
    private ArrayList<Order> orderList;

    public OrderDirectory() {
        
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
        public Order newOrder(){
        Order order = new Order();
        orderList.add(order);
        return order;
    }
    
    public Order getOrderId(String id){
        for(Order order: orderList){
            if(order.getOrderId().equals(id)){
                return order;
            }
        }
        return null;
    }
}
