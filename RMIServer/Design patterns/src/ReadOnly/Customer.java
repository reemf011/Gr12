/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadOnly;

public class Customer  {
    
    private CustomerServiceInterface i;
    
    public Customer(CustomerServiceInterface i)
    {
        this.i = i;
    }
    
    /*public void getItemInfo(int index)
    {
        i.getItemInfo(index);
    } */
}