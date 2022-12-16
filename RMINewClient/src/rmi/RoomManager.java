/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.Array;
import java.util.*;
import BookingController.Room;

public interface RoomManager extends Remote{
    
    //public String checkAvailibility(String rType) throws RemoteException;
    
    public String book(String gid, String name, String rType) throws RemoteException;
    public String[][] getListData() throws RemoteException;
    public String[] getListColumn() throws RemoteException;
     public List<Room> displayRooms() throws Exception;  
}
