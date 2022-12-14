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
 * @author DeS
 */


// public class BookingFacade extends UnicastRemoteObject implements FacadeInterface {
//     Booking c;
//    public BookingFacade() throws RemoteException {
//        c= new Booking(1, "", "","", "");
//    }
//    @Override
//    public void SetBookingData(int booking_Id,String booking_date, String booking_Status)throws RemoteException {
//    c.setBooking_Id(booking_Id);
//   // c.setBooking_Type(Booking_Type);
//    c.setBooking_date(booking_date);
//    c.setBooking_Status(booking_Status);
//   // c.setBooking_time(booking_time);
//    
//    }
//    
//     @Override
//    public String getBookingData() throws RemoteException{
//        String BookingData=c.getBooking_Id()+c.getBooking_Type()+c.getBooking_date()+c.getBooking_Status()+c.getBooking_time();
//        return BookingData;
//    }
//    
//     @Override
//    public BookingDTO getBooking() throws RemoteException {
//        
//        BookingDTO dto=new BookingDTO(c.getBooking_Id(), c.getBooking_date(), c.getBooking_Status());
//        return dto;
//    }
//
//    
// }
//    
