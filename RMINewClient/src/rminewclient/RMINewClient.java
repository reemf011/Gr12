/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rminewclient;

import CustomerController.LoginController;
import CustomerGUi.Login;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmi.DatabaseInterface;
import java.rmi.*;

/**
 *
 * 
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class RMINewClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Login gui1 = new Login();
            Registry registry = LocateRegistry.getRegistry(1099);
            DatabaseInterface db = (DatabaseInterface) registry.lookup("Database");
            db.OpenDBConnection();
            CustomerController.LoginController guiController = new CustomerController.LoginController(gui1, registry);
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                try {
                    db.CloseDBConnection();
                } catch (RemoteException ex) {
                    Logger.getLogger(RMINewClient.class.getName()).log(Level.SEVERE, null, ex);
                }
            }));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

    
           
       
        
        
        
        
        
    
    

