/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rminewserver;

import java.io.Serializable;

/**
 *
 * @author DeS
 */
public class BookingDTO implements Serializable {
    int booking_ID;
    String booking_date;
    String booking_status;

    public BookingDTO(int booking_ID, String booking_date, String booking_status) {
        this.booking_ID = booking_ID;
        this.booking_date = booking_date;
        this.booking_status = booking_status;
    }

    public int getBooking_ID() {
        return booking_ID;
    }

    public void setBooking_ID(int booking_ID) {
        this.booking_ID = booking_ID;
    }

    public String getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(String booking_date) {
        this.booking_date = booking_date;
    }

    public String getBooking_status() {
        return booking_status;
    }

    public void setBooking_status(String booking_status) {
        this.booking_status = booking_status;
    }

  
    public void checkAvailability(){}
    public void CancelBooking(){}
    public void AddBooking(){}
    public void EditBooking(){}
    
}
