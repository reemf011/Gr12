/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadOnly;

import java.util.ArrayList;

public class CustomerService implements CustomerServiceInterface {
    
    private ArrayList<Service> items;
    
    public CustomerService()
    {
        items = new ArrayList();
    }
    
    public void addItem(Service m)
    {
        items.add(m);
    }
    
    public void removeItem(Service m)
    {
        items.remove(m);
    }
    
 /*   @Override
    public void getItemInfo(int i)
    {
        System.out.println(Service.get(i));
    }
     */
    
}
