/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Ahmed
 */
public interface DatabaseInterface extends Remote{
    public void OpenDBConnection() throws RemoteException;
    public void CloseDBConnection() throws RemoteException;
}
