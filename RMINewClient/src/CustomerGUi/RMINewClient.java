/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerGUi;

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
public class RMINewClient {


    public static void main(String[] args) throws RemoteException {
           try {
            Registry reg = LocateRegistry.createRegistry(1099);
            LoginController lp = new LoginController();
            reg.rebind("login", lp);
            System.out.println("Server is up...");
        } catch(Exception ex) {
            ex.printStackTrace();
        }        
    }
    }
           
       
        
        
        
        
        
    
    

