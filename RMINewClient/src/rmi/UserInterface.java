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
 * @author reemf011
 */
public interface UserInterface  extends Remote{
    public boolean AddnewUser(String username, String password, String Email, String type)  throws RemoteException;
    public int Login(String user,String pass, String type) throws RemoteException;
    public boolean EditUser(int id, String Email, String Username, String Newusername, String newpassword, String Password, String type) throws RemoteException;
}

