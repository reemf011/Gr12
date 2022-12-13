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
      private float SpecialOffers;
      Admin instance;

    public Admin(float SpecialOffers, Admin instance, String userID, String Password) {
        super(userID, Password);
        this.SpecialOffers = SpecialOffers;
        this.instance = instance;
    }




    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<Observer> observers) {
        this.observers = observers;
    }

    public float getSpecialOffers() {
        return SpecialOffers;
    }

    public void setSpecialOffers(float SpecialOffers) {
        this.SpecialOffers = SpecialOffers;
    }


       
    public void SendingOffers(String SpecialOffers) {
      // System.out.println("Sending offers...");
        notifyObservers(SpecialOffers);
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyObservers(String SpecialOffers) {
        for(int i=0; i < observers.size();i++){
          observers.get(i).update(SpecialOffers);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    public Admin getInstance(){return null;}
    public void generatereport(){}
    public void sendcopun(){}
    public void displayreportedbooking(){}

    public void generateSalesReport(){}
      
 }


  






