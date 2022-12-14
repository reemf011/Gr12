/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rminewserver;

import java.util.ArrayList;

/**
 *
 * @author DeS
 */
public class FlightTicket {
    int Flight_ID;
    String Flight_price;
    String Flight_destination;
    String arrival_Airport;
    String arrival_date;
    String departure_Airport;
    ArrayList<Chooseseatinterface>availableSeats;

    public FlightTicket(int Flight_ID, String Flight_price, String Flight_destination, String arrival_Airport, String arrival_date, String departure_Airport, ArrayList<Chooseseatinterface> availableSeats) {
        this.Flight_ID = Flight_ID;
        this.Flight_price = Flight_price;
        this.Flight_destination = Flight_destination;
        this.arrival_Airport = arrival_Airport;
        this.arrival_date = arrival_date;
        this.departure_Airport = departure_Airport;
        this.availableSeats = availableSeats;
    }

    public int getFlight_ID() {
        return Flight_ID;
    }

    public void setFlight_ID(int Flight_ID) {
        this.Flight_ID = Flight_ID;
    }

    public String getFlight_price() {
        return Flight_price;
    }

    public void setFlight_price(String Flight_price) {
        this.Flight_price = Flight_price;
    }

    public String getFlight_destination() {
        return Flight_destination;
    }

    public void setFlight_destination(String Flight_destination) {
        this.Flight_destination = Flight_destination;
    }

    public String getArrival_Airport() {
        return arrival_Airport;
    }

    public void setArrival_Airport(String arrival_Airport) {
        this.arrival_Airport = arrival_Airport;
    }

    public String getArrival_date() {
        return arrival_date;
    }

    public void setArrival_date(String arrival_date) {
        this.arrival_date = arrival_date;
    }

    public String getDeparture_Airport() {
        return departure_Airport;
    }

    public void setDeparture_Airport(String departure_Airport) {
        this.departure_Airport = departure_Airport;
    }

    public ArrayList<Chooseseatinterface> getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(ArrayList<Chooseseatinterface> availableSeats) {
        this.availableSeats = availableSeats;
    }

    
    
    
}
