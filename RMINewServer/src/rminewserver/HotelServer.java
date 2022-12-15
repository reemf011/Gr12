/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rminewserver;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rminewserver.RoomManagerImpl;

public class HotelServer {
    
    public static void main(String[] args) {
        
        try {
            Registry r = LocateRegistry.createRegistry(1099);
            RoomManagerImpl c = new RoomManagerImpl("Hello, World!");
            Naming.rebind("HelloService", c);
            System.out.println("Server is ready.");
	} catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
        
    }
}