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
 
import java.util.ArrayList;

 public class Admin extends User  {
       private ArrayList<Observer> observers = new ArrayList<Observer>();
       private String type;
       private float SpecialOffers;
       private String System;

    public Admin(String type, float SpecialOffers, String System, Admin instance, String Fname, String Lname, int Id, String Email, String Gender, String DOB, String UserID, String password, ArrayList<BookingFacade> oldReportedBooking, ArrayList<BookingFacade> upcomingReportedBookings) {
        super(Fname, Lname, Id, Email, Gender, DOB, UserID, password, oldReportedBooking, upcomingReportedBookings);
        this.type = type;
        this.SpecialOffers = SpecialOffers;
        this.System = System;
       // this.instance = instance;
    }

//       public Admin(String type, float SpecialOffers, String System) {
//              this.type = type;
//              this.SpecialOffers = SpecialOffers;
//              this.System = System;
//       }

       public float getSpecialOffers() {
              return SpecialOffers;
       }

       public void setSpecialOffers(float SpecialOffers) {
              this.SpecialOffers = SpecialOffers;
             // notifyObservers();
       }

       public String getSystem() {
              return this.System;
       }

       public String getType() {
              return this.type;
       }
//
//       @Override
//       public void registerObserver(Observer observer) {
//              observers.add(observer);
//
//       }
//
//       @Override
//       public void removeObserver(Observer observer) {
//              observers.remove(observer);
//
//       }
//
//       @Override
//       public void notifyObservers() {
//              for (Observer ob : observers) {
//                     /*System.out.println("Notifying Observers on special offers discount");
//                     */
//                     ob.update(this.SpecialOffers);
//           
//              }

       }

//
//    Admin instance;
//    public Admin getInstance(){return null;}
//    public void generatereport(){}
//    public void sendcopun(){}
//    public void displayreportedbooking(){}
//
//    public void generateSalesReport(){}
//
//  


//}



