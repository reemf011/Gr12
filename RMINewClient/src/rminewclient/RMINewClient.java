/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rminewclient;

import rmi.LogInFacade;
import controllers.MainWindowController;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import rmi.BookingFacadeInterface;

/**
 *
 * 
 */
public class RMINewClient {


    public static void main(String[] args) throws RemoteException {
//
//        // We create an object from the GUI window
//        MainWindow gui = new MainWindow();
//        gui.setLocationRelativeTo(null); // This makes the window appears centered
//        gui.setVisible(true); // This shows the gui
//        
//        // We connect to the RMI Registry
//        Registry r = LocateRegistry.getRegistry(1099);
//        
//        // we create a new object from the controller and we pass it the
//        // gui object along with the registry object
//        MainWindowController gui_controller = new MainWindowController(gui, r);
            Registry reg = LocateRegistry.getRegistry("localhost",1099);  
            try{
           
            LogInFacade server = (LogInFacade) reg.lookup("rmi://localhost/service");
            Scanner scan = new Scanner(System.in); 
            
            System.out.println("Enter username : ");
            String username = scan.nextLine();
            System.out.println("Enter password : ");
            String password = scan.nextLine();
            
            String response = server.login(username, password);
            
            System.out.println("Response from server : " + response);
        }catch(RemoteException | NotBoundException ex){
            System.out.println(ex.getMessage());
        }
        
          try {
            // Search for the stub "calc"
            BookingFacadeInterface f = (BookingFacadeInterface) reg.lookup("fac");

             //Invoke the remote methods on the remote object
//           f.SetBookingData(12, "12/3/2022 ", " Reserved");
//           
//           String BookingInfo =f.getBookingData();
//           System.out.println("Booking info  : "+BookingInfo);
            
           f.SetBookingData(13 , "0/11/2022 ", "Not Confirmred yet ");
           BookingDTO c= f.getBooking();
            System.out.println("Booking ID "+c.getBooking_ID());
            
           
        } catch (Exception ex) {
            System.out.println("Exception occured");
        }
        
        
        
        
        
    }
    
}
