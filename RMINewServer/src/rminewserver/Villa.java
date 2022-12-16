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
public class Villa {
    int Villa_Id;
    String V_Name;
    String Owner;
    String start_date;
    String end_date;
    double V_price;
    String Location;

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }
    
    
    public void setVilla_Id(int Villa_Id) {
        this.Villa_Id = Villa_Id;
    }

    public void setV_Name(String V_Name) {
        this.V_Name = V_Name;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public String getStart_date() {
        return start_date;
    }

    public String getEnd_date() {
        return end_date;
    }
    
}
