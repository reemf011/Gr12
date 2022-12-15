/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rminewserver;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmi.GradeInterface;

/**
 *
 * 
 */
public class RMINewServer {

    static Customer s1;
    static Customer s2;
    static Car c1;
    static Car c2;
    static Hotel h1;
    static Hotel h2;

    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        
      //Observer Design Pattern Application - Reem 197957   
     Admin a = new Admin();
     Customer cust1 = new Customer("Omar","OmarSa_20@gmail.com", "male","20/1/1988","5452 2121 2121 5465",null,null,"Omar7863", "23212245");
     
     a.registerObserver(cust1);
     
     a.reportOffers("there is 20% off vouchers on luxuries hotels in Monaco ");
     
     
     
      //Singleton Design Pattern Application - Sheroq 199818
      SingeltonClass object = SingeltonClass.getInstance();
        object.showMessage();
        
       
       
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);
        
        //Calling the class for the database 
        DB db = new DB();
        
        // Here we create our remote object
        //GradeInterface g = new Grade();
        
        // An RMI Registry initialized on port 1099
        Registry r = LocateRegistry.createRegistry(1099);
        
        // Our remote object g is binded to the name "grade"
      //  r.bind("grade", g);
        
        // Outputs that the server is ready
        System.out.println("The server is ready");
        
        
      s1 = new Customer ("Meriam", "Meriam12@yahoo.com", "Female", "12/11/2002","2121 2154 6565", null, null, "Mariam121", "121dB454");
     s2 = new Customer ("Abdelrahman", "abdo13@yahoo.com", "Male", "12/3/1998","5665 5455 5523 4545", null, null, "Hgrs121", "515215BB");
        
        c1 = new Car (1, 1 ,"Cairo","Private Car", 15000);
        c2 = new Car (2, 3 ,"Tagmoa","Taxi", 100);
        
        h1 = new Hotel (1, "Marriot Resort" ,"Cairo",5000,500, 300);
        h2 = new Hotel (2, "Kimpinsiki Hotel" ,"Cairo",10000,600, 400);
         

        
        db.insertCustomer(s1);
        db.insertCustomer(s2);
       
        db.deleteCustomer(s1);
        db.deleteCustomer(s2);
        
        
        
        
        
        db.insertCar(c1);
        db.insertCar(c2);
       
        db.updateCar(c1);
        db.updateCar(c2);

        db.deleteCar(1);
        db.deleteCar(2);
        
        
        db.insertHotel(h1);
        db.insertHotel(h2);

        
      //  db.getHotelName("Marriot Resort");
                
        
        
        db.close();
        } 


         
    
    
}
