/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubdemo;

/**
 *
 * @author reemf011
 */
public class Booking {
    
    int booking_Id;
    String Booking_Type;
    String booking_date;
    String booking_Status;
    String booking_time;

    public Booking(int booking_Id, String Booking_Type, String booking_date, String booking_Status, String booking_time) {
        this.booking_Id = booking_Id;
        this.Booking_Type = Booking_Type;
        this.booking_date = booking_date;
        this.booking_Status = booking_Status;
        this.booking_time = booking_time;
    }
    
    

    public int getBooking_Id() {
        return booking_Id;
    }

    public void setBooking_Id(int booking_Id) {
        this.booking_Id = booking_Id;
    }

    public String getBooking_Type() {
        return Booking_Type;
    }

    public void setBooking_Type(String Booking_Type) {
        this.Booking_Type = Booking_Type;
    }

    public String getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(String booking_date) {
        this.booking_date = booking_date;
    }

    public String getBooking_Status() {
        return booking_Status;
    }

    public void setBooking_Status(String booking_Status) {
        this.booking_Status = booking_Status;
    }

    public String getBooking_time() {
        return booking_time;
    }

    public void setBooking_time(String booking_time) {
        this.booking_time = booking_time;
    }


}
