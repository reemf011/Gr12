/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rminewserver;

import java.util.ArrayList;

/**
 *
 * @author DeS
 */
public abstract class User {
    String userID;
    String Password;

    public User() {
    }
    

    public User(String userID, String Password) {
        this.userID = userID;
        this.Password = Password;
    }

    public String getUserID() {
        return userID;
    }

    public String getPassword() {
        return Password;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
   
   
    public void Login(){}
    public void SignUp(){}
}
