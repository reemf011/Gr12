/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubdemo;

/**
 *
 * @author DeS
 */
public class Apartment {
    int Apartmentid;
    String Apartmentname;
    String Owner;

    public String getApartmentname() {
        return Apartmentname;
    }

    public void setApartmentname(String Apartmentname) {
        this.Apartmentname = Apartmentname;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }
    public void Book(){}
}
