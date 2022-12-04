/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadOnly;


public class Service {

    private String Department;

    public Service(String Department) {
        this.Department = Department;
    }
       
    @Override
    public String toString() {
        return "Service department: " + Department ;
    }

}
