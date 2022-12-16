/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rminewclient;

import CustomerController.LoginController;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmi.DatabaseInterface;

/**
 *
 * 
 */
public class RMINewClient {


    public static void main(String[] args) throws RemoteException {
              try {
            Login gui1 = new Login();
            Registry registry = LocateRegistry.getRegistry(1099);
            DatabaseInterface db = (DatabaseInterface) registry.lookup("Database");
            db.OpenDBConnection();
            LoginController guiController = new LoginController(gui1, registry);
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
    

