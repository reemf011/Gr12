/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubdemo;

import static com.google.gson.internal.bind.TypeAdapters.UUID;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author DeS
 */
  public class Customer extends User  {
    String creditCardinfo;
 
//   private final UUID guid;
//	
//	public Customer() {this.guid = UUID.randomUUId();
//	}
//	
//	public Customer(UUID guid) {
//		this.guid = guid;
//	}

    public Customer(String creditCardinfo, String Fname, String Lname, int Id, String Email, String Gender, String DOB, String UserID, String password, ArrayList<BookingFacade> oldReportedBooking, ArrayList<BookingFacade> upcomingReportedBookings) {
        super(Fname, Lname, Id, Email, Gender, DOB, UserID, password, oldReportedBooking, upcomingReportedBookings);
        this.creditCardinfo = creditCardinfo;
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


    

