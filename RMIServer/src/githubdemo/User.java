/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubdemo;

import java.util.ArrayList;

/**
 *
 * @author DeS
 */
public class User {
    String Fname;
    String Lname;
    int Id;
    String Email;
    String Gender;
    String DOB;
    String UserID;
    String password;
    ArrayList<BookingFacade> oldReportedBooking;
    ArrayList<BookingFacade> upcomingReportedBookings;

    public User(String Fname, String Lname, int Id, String Email, String Gender, String DOB, String UserID, String password, ArrayList<BookingFacade> oldReportedBooking, ArrayList<BookingFacade> upcomingReportedBookings) {
        this.Fname = Fname;
        this.Lname = Lname;
        this.Id = Id;
        this.Email = Email;
        this.Gender = Gender;
        this.DOB = DOB;
        this.UserID = UserID;
        this.password = password;
        this.oldReportedBooking = oldReportedBooking;
        this.upcomingReportedBookings = upcomingReportedBookings;
    }


  
    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
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

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    public void Login(){}
    public void SignUp(){}
}
