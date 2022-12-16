/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author reemf011
 */

public interface CustomerInterface extends Remote{
    public void AddCustomer (int id, String name, String email) throws RemoteException;
    public void RemoveCustomer(int id) throws RemoteException;
    public void UpdateCustomer(int id,String name, String email) throws RemoteException;
    public ArrayList<String> ViewBookings(int sID) throws RemoteException;
    
}
