/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rminewserver;

import rmi.BookingFacadeInterface;
import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author reemf011
 */
public abstract class BookingFacade extends UnicastRemoteObject implements BookingFacadeInterface {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    Booking b;
    
//         public BookingFacade(Booking b) {
//        this.b = b;
//    }
//    

    public BookingFacade(Booking b) throws RemoteException {
        this.b = b;
    }

    public BookingFacade(Booking b, int port) throws RemoteException {
        super(port);
        this.b = b;
    }

    public BookingFacade(Booking b, int port, RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws RemoteException {
        super(port, csf, ssf);
        this.b = b;
    }
    


    public BookingFacade() throws RemoteException {
        b = new Booking(0, "", "","","");
    }


   
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

    @Override
    public void CancelBooking(int booking_ID) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AddBooking(int booking_ID, String booking_data, String booking_status) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void EditBooking(int booking_ID) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    
    

}



    
    




