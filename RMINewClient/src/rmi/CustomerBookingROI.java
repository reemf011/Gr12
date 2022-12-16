/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;


import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import javax.swing.text.Document;
//import org.bson.Document;

/**
 *
 * @author user
 */
public interface CustomerBookingROI  {
    


    public ArrayList<String> ViewConfirmedReservations() throws RemoteException;
    public ArrayList<Document> ViewBookingType(int ID) throws RemoteException;
    public String AddBooking(int sID, int CID) throws RemoteException;
    public String CancleBooking(int sID, int CID) throws RemoteException;
    public ArrayList<Document> viewBookingBasedOnVisiblity(int CourseID)throws RemoteException;
}

    
    
    

