/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadOnly;

public class Admin {
    
    private CustomerService i;
    
    public Admin(CustomerService i)
    {
        this.i = i;
    }
    
    public void addService(Service m)
    {
        i.addService(m);
    }
    
    public void EditService(Service m)
    {
        i.EditService(m);
    }
    public void RemoveService(Service m)
    {
        i.RemoveService(m);
    }
    
  /*  public void getItemInfo(int index)
    {
        i.getItemInfo(index);
    }
     */
}
