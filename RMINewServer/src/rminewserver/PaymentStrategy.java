/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rminewserver;

import java.rmi.RemoteException;

/**
 *
 * @author note book
 */
public interface PaymentStrategy
{
    public boolean Pay(int type, int PaymentID, int UserID, String date, double amount) throws RemoteException;
    public String ViewPayment(String type, int pID) throws RemoteException;
    public boolean AddPayment(int paymeID, int UserID, String date, double amount) throws RemoteException;

}
