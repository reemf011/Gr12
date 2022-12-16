/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rminewserver;

import java.util.ArrayList;
import java.rmi.RemoteException;
import java.rmi.server.RemoteRef;
import java.rmi.server.UnicastRemoteObject;
import rmi.LogInInterface;
                     
public class User extends UnicastRemoteObject implements LogInInterface{
      int UserID;
      String UserName;
      String pass;
      String Email;
      UserMapper sm;

    public User() {
    }
      
      
    public User(Database db) throws RemoteException {
        sm = new UserMapper(db);
    }

    public User(int UserID, String pass) {
        this.UserID = UserID;
        this.pass = pass;
    }

    
    public User(int UserID,String UserName,String pass,String Email) {
        this.UserID = UserID;
        this.UserName = UserName;
        this.pass = pass;
        this.Email =Email;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    
 

    @Override
    public boolean AddnewAccount(String username, String password, String Email) throws RemoteException {
            return sm.SignUp(username, password,Email);

        
    }

    @Override
    public boolean EditAccount(int id, String Email, String Username, String Newusername, String password, String newPassword) throws RemoteException{
        return sm.editAccount(id, Email, Username, Newusername, password, newPassword);
    }

    @Override
    public int login(String username, String password) throws RemoteException {
        return sm.loginVerify(username, password);
    }


   
}
