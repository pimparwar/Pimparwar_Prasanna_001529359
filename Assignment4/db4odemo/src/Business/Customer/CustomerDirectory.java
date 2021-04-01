/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
        private ArrayList<Customer> customerDirectory;
         
    public CustomerDirectory() {
        
        customerDirectory = new ArrayList();
        
    }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public Customer newCustomer(String customerName, String email, String pN, int age, String homeAddress, String userName){
        Customer c = new Customer(customerName,pN, email,  userName, homeAddress, age);
        customerDirectory.add(c);
        return c;
    }
    
    public void removeCustomer(Customer c){
        customerDirectory.remove(c);
    }
    
    public Customer getCustomer(String customerName){
        for(Customer customer: customerDirectory){
            if(customer.getCustomerName().equalsIgnoreCase(customerName)){
                return customer;
            }
        }
        return null;
    }
}
