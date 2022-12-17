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
import rmi.BookHoteInterface;
import rmi.DatabseInterface;
import rmi.LogInInterface;
import rmi.CustomerInterface;


/**
 *
 * 
 */
public class RMINewServer {

   

    public static void main(String[] args) {
            try {
            // My remote object [Skeleton]
            CustomerInterface c = new Customer();
            LogInInterface l = new Login();
            DatabaseInterface D = new Database();
            BookingFacade b = new booking();

            // My RMI Registry
            
            Registry registry = LocateRegistry.createRegistry(500);
            
            //Add my object to the RMI Registry
            // Now we have added the remote object in the RMI registry
            // The bind function take two things, unqiue name for the object and the remoted object
            registry.bind("cust", c);
            registry.bind("login", l);
            registry.bind("booking", b);

   
            
            System.out.println("My server is ready...");   
        } catch (Exception ex) {
           System.out.println("Exception occured");
        }   

        
        
        
        
        /*   Registry r = LocateRegistry.createRegistry(1099);
        DatabaseInterface dbb = new Database(1);
        r.bind("Database", dbb);
        Database db;
        boolean check = false;
        while (true) {
            System.out.printf("");
            System.out.printf("");
            if (Database.CheckDB() && !check) {
                db = Database.getDb();
                LogInInterface g = new User(db);
                BookHotelInterface course = new Hotel(db);
                CustomerInterface customer = new Customer(db);
            
                
                
                r.bind("User", g);
                r.bind("Course", course);
                r.bind("Customer", customer);

                check = true;
                System.out.println("The server is ready");
            } else if (check == true && !Database.CheckDB()) {
                r.unbind("User");
                r.unbind("Course");
                r.unbind("Customer");

                check = false;
            }
        }
*/
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
         
     /* 


    static Customer s1;
    static Customer s2;
    static Car c1;
    static Car c2;
    static Hotel h1;
    static Hotel h2;


    //Observer Design Pattern Application - Reem 197957   
     Admin a = new Admin();
     Customer cust1 = new Customer(12,"Omar", "1234_Omar","Omar7863@ gmail.com");
     
     a.registerObserver(cust1);
     
     a.reportOffers("there is 20% off vouchers on luxuries hotels in Monaco ");
     
     
     
      //Singleton Design Pattern Application - Sheroq 199818
      SingeltonClass object = SingeltonClass.getInstance();
        object.showMessage();
        
       
       
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);
        
        //Calling the class for the database 
        Database db = new Database();
        
        // Here we create our remote object
        //GradeInterface g = new Grade();
        
        // An RMI Registry initialized on port 1099
        Registry r = LocateRegistry.createRegistry(1099);
        
        // Our remote object g is binded to the name "grade"
      //  r.bind("grade", g);
        
        // Outputs that the server is ready
        System.out.println("The server is ready");
        
        
      s1 = new Customer ( 13, "Meriam", "Meria13", "Meriam12@yahoo.com");
     s2 = new Customer (14,"Abdelrahman", "Abdelrahamn215", "abdo13@yahoo.com");
        
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


         
    
}/*    

