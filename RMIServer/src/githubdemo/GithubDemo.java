/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubdemo;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author reemf011
 */
public class GithubDemo {

    /**
     * @param args the command line arguments
     */
       static PrivateCar s1;
       
    public static void main(String[] args) throws RemoteException{
        
        // TODO code application logic here
     
         Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);
        
        //Calling the class for the database 
        db DB = new db();
        
           Registry r = LocateRegistry.createRegistry(1099);
        
        System.out.println("Server is ready");
        
        s1 = new PrivateCar (1, 12, "ffmd", "12jn", 2021,"red");
       
        
        DB.insertCustomer(s1);
        
        
         DB.close();
        
//             Customer onlineMedia = new Customer();
//              Admin personalLoan = new Admin("Special Offer Discount", 12.5f, "Perecent");
//              personalLoan.registerObserver(onlineMedia);
//              personalLoan.setSpecialOffers(20f);
//              personalLoan.setSpecialOffers(30f);
//              personalLoan.setSpecialOffers(50f);
        
    }
   
}

    
    

    

