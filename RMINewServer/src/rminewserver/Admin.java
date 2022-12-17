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

 public class Admin extends User implements Subject  {
     
      private ArrayList<Observer> observers = new ArrayList<Observer>();
     
      Admin instance;

    public Admin(Admin instance, int UserID, String pass) {
        super(UserID, pass);
        this.instance = instance;
    }

    public Admin() {
    }
    

// Observers functions - Reem 197957
    public void reportOffers(String SpecialOffers) {
        System.out.println("Sending Offers...");
        notifyObservers(SpecialOffers);
    }
    
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String SpecialOffers) {
        for(int i=0; i < observers.size();i++){
          observers.get(i).update(SpecialOffers);
        }
    }

 // singelton design pattern - sheroq Hesham 199818
    
    

    
    public Admin getInstance(){return null;}
    public void generatereport(){}
    public void sendcopun(){} //sending offers to normal subscriobers
    public void displayreportedbooking(){}

    public void generateSalesReport(){}
      
 }


  






