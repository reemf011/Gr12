/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rminewserver;

/**
 *
 * @author DeS
 */
public class Apartment {
    int Apartmentid;
    String Owner;
    String start_date;
    String end_date;
    double A_price;
    String Location;

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public int getApartmentid() {
        return Apartmentid;
    }

    public String getStart_date() {
        return start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public double getA_price() {
        return A_price;
    }

    public String getLocation() {
        return Location;
    }
    
    public void Book(){}
}
