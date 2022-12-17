/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rminewserver;

import java.rmi.RemoteException;

/**
 *
 * @author DeS
 */
public class PayPal implements PaymentStrategy{
    
    private String email;
    private String password;
 
    public PayPal(String emaill, String pwd){
        this.email=emaill;
        this.password=pwd;
    }

   // @Override
    public void pay(String amount) {
         System.out.println(amount + "$ paid using Paypal.");
    }

    @Override
    public boolean Pay(int type, int PaymentID, int UserID, String date, double amount) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String ViewPayment(String type, int pID) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean AddPayment(int paymeID, int UserID, String date, double amount) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
