/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rminewserver;

import static com.google.gson.internal.bind.TypeAdapters.UUID;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author DeS
 */
 class Customer extends User implements Observer   {
    String name;
    String Email;
    String Gender;
    String DOB;
    String creditCardinfo;
    ArrayList<BookingFacade> oldReportedBooking;
    ArrayList<BookingFacade> upcomingReportedBookings;

    
    public Customer(String name, String Email, String Gender, String DOB, String creditCardinfo, ArrayList<BookingFacade> oldReportedBooking, ArrayList<BookingFacade> upcomingReportedBookings, String userID, String Password) {
        super(userID, Password);
        this.name = name;
        this.Email = Email;
        this.Gender = Gender;
        this.DOB = DOB;

        this.creditCardinfo = creditCardinfo;
        this.oldReportedBooking = oldReportedBooking;
        this.upcomingReportedBookings = upcomingReportedBookings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    
    public String getCreditCardinfo() {
        return creditCardinfo;
    }

    public void setCreditCardinfo(String creditCardinfo) {
        this.creditCardinfo = creditCardinfo;
    }

    public ArrayList<BookingFacade> getOldReportedBooking() {
        return oldReportedBooking;
    }

    public void setOldReportedBooking(ArrayList<BookingFacade> oldReportedBooking) {
        this.oldReportedBooking = oldReportedBooking;
    }

    public ArrayList<BookingFacade> getUpcomingReportedBookings() {
        return upcomingReportedBookings;
    }

    public void setUpcomingReportedBookings(ArrayList<BookingFacade> upcomingReportedBookings) {
        this.upcomingReportedBookings = upcomingReportedBookings;
    }



    
     
 



    @Override
    public void update(String SpecialOffers) {
        System.out.println(name+"recieved the exculsive Recieved Offers"+ name);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  

  
  

}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    public String getCreditCardinfo() {
//        return creditCardinfo;
//    }
//
//    public void setCreditCardinfo(String creditCardinfo) {
//        this.creditCardinfo = creditCardinfo;
//    }
//     @Override
//       public void update(float SpecialOffers) {
//              System.out.println("ALERT!!: EXCLUSIVE DISCOUNT"+ SpecialOffers+ "%");
//       }
//    public void displayReportedBoookings(String oldReportedBooking, String upcomingReportedBooking){}
//    public void selectFilter(){}
//    public void Search(){}
//    public void SendFeedback(String Feedbackdetails){}


    

