/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rminewserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author reemf011
 */
public class BookingFacade extends UnicastRemoteObject implements BookingFacadeInterface {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    Booking b;
    public BookingFacade() throws RemoteException{
           b = new Booking(0, "", "","","");
    }

    // public BookingFacade(Booking b) {
      //  this.b = b;
    //}
    
   
    @Override
    public void SetBookingData(int booking_ID, String booking_date, String booking_status)throws RemoteException {
        b.setBooking_Id(booking_ID);
        b.setBooking_date(booking_date);
        b.setBooking_Status(booking_status);
        
    }

    @Override
    public String getBookingData() throws RemoteException{
        String BookingData=b.getBooking_Id()+b.getBooking_date()+b.getBooking_Status();
        return BookingData;
    }

    @Override
    public BookingDTO getBooking() throws RemoteException {
        
        BookingDTO dto=new BookingDTO(b.getBooking_Id(),b.getBooking_date() ,b.getBooking_Status());
        return dto;
    }
     
    
    

}



    
    




