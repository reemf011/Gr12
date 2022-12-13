/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubdemo;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
//import rmi.GradeInterface;

/**
 *
 * 
 */
public class GithubDemo {

    static Student s1;
    static Student s2;

    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        
        
                   
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);
        
        //Calling the class for the database 
        db db = new db();
        
        // Here we create our remote object
        //GradeInterface g = new Grade();
        
        // An RMI Registry initialized on port 1099
        Registry r = LocateRegistry.createRegistry(1099);
        
        // Our remote object g is binded to the name "grade"
        //r.bind("grade", g);
        
        // Outputs that the server is ready
        System.out.println("The server is ready");
        
        
        s1 = new Student ("Meriam", 123, "Meriam12@yahoo.com");
        s2 = new Student ("Alaa", 1234, "Alaa19@yahoo.com");
        
        db.insertStudent(s1);
        db.insertStudent(s2);
        
         db.close();
        } 


         
    
    
}


    
    
//  Customer onlineMedia = new Customer();
////              Admin personalLoan = new Admin("Special Offer Discount", 12.5f, "Perecent");
////              personalLoan.registerObserver(onlineMedia);
////              personalLoan.setSpecialOffers(20f);
////              personalLoan.setSpecialOffers(30f);
////              personalLoan.setSpecialOffers(50f);
    

