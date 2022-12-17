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
    int FlightNumber;
    String FlightDeparture;
    String FlightArrival;
    String SeatType;
    String Date;
    String Time;
    ArrayList<Chooseseatinterface>availableSeats;

    public FlightTicket(int FlightNumber, String FlightDeparture, String FlightArrival, String SeatType, String Date, String Time, ArrayList<Chooseseatinterface> availableSeats) {
        this.FlightNumber = FlightNumber;
        this.FlightDeparture = FlightDeparture;
        this.FlightArrival = FlightArrival;
        this.SeatType = SeatType;
        this.Date = Date;
        this.Time = Time;
        this.availableSeats = availableSeats;
    }

    public int getFlightNumber() {
        return FlightNumber;
    }

    public void setFlightNumber(int FlightNumber) {
        this.FlightNumber = FlightNumber;
    }

    public String getFlightDeparture() {
        return FlightDeparture;
    }

    public void setFlightDeparture(String FlightDeparture) {
        this.FlightDeparture = FlightDeparture;
    }

    public String getFlightArrival() {
        return FlightArrival;
    }

    public void setFlightArrival(String FlightArrival) {
        this.FlightArrival = FlightArrival;
    }

    public String getSeatType() {
        return SeatType;
    }

    public void setSeatType(String SeatType) {
        this.SeatType = SeatType;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public ArrayList<Chooseseatinterface> getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(ArrayList<Chooseseatinterface> availableSeats) {
        this.availableSeats = availableSeats;
    }

    
    
    
}
