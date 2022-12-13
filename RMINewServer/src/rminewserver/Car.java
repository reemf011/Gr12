/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rminewserver;
import com.mongodb.MongoClient;
import com.mongodb.client.model.Filters;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import org.bson.Document;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;
/**
 *
 * @author DeS
 */
public class Car {
    int BookID;
    int Time;
    String Location;
    String CarType;
    int Car_Price;
 DB db ; 
    
    public Car() throws RemoteException{
         db=new DB();
        db.mongoClient = new MongoClient();
        db.database = db.mongoClient.getDatabase("ReservationSystem");
    }

    public Car(int BookID, int Time, String Location, String CarType, int Car_Price) {
        this.BookID = BookID;
        this.Time = Time;
        this.Location = Location;
        this.CarType = CarType;
        this.Car_Price = Car_Price;
    }
    
    
    public int getBookID() {
        return BookID;
    }

    public void setBookID(int BookID) {
        this.BookID = BookID;
    }

    public int getTime() {
        return Time;
    }

    public void setTime(int Time) {
        this.Time = Time;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getCarType() {
        return CarType;
    }

    public void setCarType(String CarType) {
        this.CarType = CarType;
    }

    public int getCar_Price() {
        return Car_Price;
    }

    public void setCar_Price(int Car_Price) {
        this.Car_Price = Car_Price;
    }
    public void ChooseCar(){}
    public void displayCarinfo(){}
    public void Rentalform(){}
}
