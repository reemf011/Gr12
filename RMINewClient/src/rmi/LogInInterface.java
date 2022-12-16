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
 * @author Ghadeer
 */
public interface LogInInterface extends Remote{
    public boolean AddnewAccount(String username, String password, String Email)  throws RemoteException;
    
    public String login(String username, String password) throws RemoteException;
}


