/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientrmi;

/**
 *
 * @author reemf011
 */
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ClientRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

          try {
            // Connecting to the RMI Registry created on the server
            Registry registry = LocateRegistry.getRegistry(1099);

            // Search for the stub "calc"
            FacadeInterface f = (FacadeInterface) registry.lookup("fac");

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
  

