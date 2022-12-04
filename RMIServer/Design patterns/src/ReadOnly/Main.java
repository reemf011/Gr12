/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadOnly;


public class Main {

    public static void main(String[] args) {
        CustomerService i = new CustomerService();
        Admin Admin = new Admin(i);
        Customer Customer = new Customer(i);
        
        Admin.addService(new Service("a"));
        Admin.addService(new Service("p"));
        
       /* Customer.getItemInfo(0);
        Customer.getItemInfo(1);
    }
     */
    }
