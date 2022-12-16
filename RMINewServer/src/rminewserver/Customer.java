/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rminewserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.UUID;
import rmi.CustomerInterface;

/**
 *
 * @author DeS
 */

 class Customer extends UnicastRemoteObject implements Observer, CustomerInterface {

    /*String name;
    String Gender;
    String DOB;
    String creditCardinfo;
    ArrayList<BookingFacade> oldReportedBooking;
    ArrayList<BookingFacade> upcomingReportedBookings;

    public Customer(String name, String Gender, String DOB, String creditCardinfo, ArrayList<BookingFacade> oldReportedBooking, ArrayList<BookingFacade> upcomingReportedBookings, String UserID, String UserName, String pass, String Email) {
        super(UserID, UserName, pass, Email);
        this.name = name;
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
    }*/

   //Observer Design Pattren: update functoin to update the users with the special offers Reem 197957*/    
  
     int UserID;
     String UserName;
     String pass;
     String Email;
             
    private CustomerMapper ct;

    public Customer(int UserID, String UserName, String pass, String Email) {
        this.UserID = UserID;
        this.UserName = UserName;
        this.pass = pass;
        this.Email = Email;
    }


    public Customer(Database db)  throws RemoteException{
        ct = new CustomerMapper(db);
    }
    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

 

    @Override
    public void update(String SpecialOffers) {
        System.out.println(UserName+" "+"recieved the exculsive Offers");
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AddCustomer(int id, String name, String email) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RemoveCustomer(int id) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void UpdateCustomer(int id, String name, String email) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<String> ViewBookings(int sID) throws RemoteException {
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


    

