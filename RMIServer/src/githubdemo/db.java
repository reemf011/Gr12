/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubdemo;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;

public class db {

    public MongoClient mongoclient;
      public MongoDatabase mongodatabase;
    public  MongoCollection <Document>  mongocollection;
       private Gson gson = new Gson();
       
        public db() 
    {
        // Disables Mongo Logs
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        // Initialize
        mongoclient = new MongoClient();
        // Database name
        mongodatabase = mongoclient.getDatabase("Resv1"); 
        // Collection for the doctor 
        mongocollection = mongodatabase.getCollection("PrivateCar"); 
  
   
    }
        
    public void insertCustomer(PrivateCar s) {
        mongocollection.insertOne(Document.parse(gson.toJson(s)));
        System.out.println("PrivateCar inserted.");
    }
    



        public void close() {
        mongoclient.close();
    }
    
}

    


/**
 *
 * @author DeS
 */
