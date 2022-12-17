/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Mostafa
 */
public interface FeedBackInterface extends Remote{
   public boolean AddNewFeedBack( int CustomerId, String date, int Rate, String complaint) throws RemoteException;
    public boolean deleteFeedBack(String type, int id) throws RemoteException;
    public boolean UpdateFeedBack(int CustomerId, String date, int Rate, String complaint) throws RemoteException;
    public ArrayList<String> ViewAll(int Sid) throws RemoteException;
    
}
