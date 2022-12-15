/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rminewserver;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;

/**
 *
 * @author meriam
 */
public class DB {
    public static MongoClient mongoClient;
    
   public static MongoDatabase database;
    
   MongoCollection<Document> collection1;
   MongoCollection<Document> collection2;
   MongoCollection<Document> collection3;
   MongoCollection<Document> collection4;
  
   public static Gson gson = new Gson();
    
   
   public DB() 
    {
        // Disables Mongo Logs
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        // Initialize
        mongoClient = new MongoClient();
        // Database name
        database = mongoClient.getDatabase("ReservationSytem"); 
        collection1 = database.getCollection("Customer"); 
        collection2 = database.getCollection("Car");
        collection3 = database.getCollection("Hotel");
        collection4 = database.getCollection("CustomerService");
        
      }
   
         public void insertHotel(Hotel h) 
    {
        collection3.insertOne(Document.parse(gson.toJson(h)));
        System.out.println("Hotel is inserted successfully.");
    }
         
        // update customer in the customer collection
        public Hotel getHotelName(String Hotel_Name) {
        Document doc = collection3.find(Filters.eq("hotel name", Hotel_Name)).first();
        Hotel Result = gson.fromJson(doc.toJson(), Hotel.class);
        return Result;
    }
        
        
        public void updateHotel(Hotel h) {
        Document doc = Document.parse(gson.toJson(h));
        collection3.replaceOne(Filters.eq("Hotel's Name", h.getHotel_Name()), doc);
    }
        
        
        public void updateHotelName( String name,String newRoomCnt) {
       
        collection3.updateOne(Filters.eq("Hotel's name",name), Updates.set("Room_Count",newRoomCnt));
    }

       
       
       
       
         public void insertCustomer(Customer c) 
    {
        collection1.insertOne(Document.parse(gson.toJson(c)));
        System.out.println("Customer is inserted is inserted.");
    }
         
        // update customer in the customer collection
        public Customer getCustomegrEmail(String Email) {
        Document doc = collection2.find(Filters.eq("customer's email", Email)).first();
        Customer result = gson.fromJson(doc.toJson(), Customer.class);
        return result;
    }
        
        
        public void updateCustomer(Customer c) {
        Document doc = Document.parse(gson.toJson(c));
        collection2.replaceOne(Filters.eq("customer's email", c.getEmail()), doc);
    }
        
        
        public void updateCustomerEmail( String name,String newEmail) {
       
        collection2.updateOne(Filters.eq("customer's name",name), Updates.set("Email",newEmail));
    }
        
         
         
         
         
        public void deleteCustomer(String name) {
        collection1.deleteOne(Filters.eq("name", name));
        System.out.println("Customer is deleted");
    }

        
        /* CAR DATA MAPPER*/
         //insert car to car collection in the database 
        public void insertCar(Car c) 
    {
        collection2.insertOne(Document.parse(gson.toJson(c)));
        System.out.println("Car is inserted is inserted.");
    }
        // update car in the car collection
        public Car getCarLocation(String Location) {
        Document doc = collection2.find(Filters.eq("Car Location", Location)).first();
        Car result = gson.fromJson(doc.toJson(), Car.class);
        return result;
    }
        
        
        public void updateCar(Car c) {
        Document doc = Document.parse(gson.toJson(c));
        collection2.replaceOne(Filters.eq("Car Location", c.getLocation()), doc);
    }
        
        
        public void updateCarLocation( int BookID,String newLocation) {
       
        collection2.updateOne(Filters.eq("car booking ID",BookID), Updates.set("Location",newLocation));
    }
        
    
        // delete car from car collection in the database
        public void deleteCar(int BookID) {
        collection2.deleteOne(Filters.eq("car no.", BookID));
        System.out.println("Car is deleted");
    }        
              
         
         public void close() 
    {
        mongoClient.close();
    }
}
