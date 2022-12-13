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
public class PrivateCar {
    int Car_ID;
    int Price;
    String Car_Model;
    String Rental_duration;
    int Year_Of_Production;
    String CarColour;

    public PrivateCar(int Car_ID, int Price, String Car_Model, String Rental_duration, int Year_Of_Production, String CarColour) {
        this.Car_ID = Car_ID;
        this.Price = Price;
        this.Car_Model = Car_Model;
        this.Rental_duration = Rental_duration;
        this.Year_Of_Production = Year_Of_Production;
        this.CarColour = CarColour;
    }

    public int getCar_ID() {
        return Car_ID;
    }

    public void setCar_ID(int Car_ID) {
        this.Car_ID = Car_ID;
    }

    public String getCar_Model() {
        return Car_Model;
    }

    public void setCar_Model(String Car_Model) {
        this.Car_Model = Car_Model;
    }
    public void displayCarinfo(){}
    public void BookCar(){}
            
}
