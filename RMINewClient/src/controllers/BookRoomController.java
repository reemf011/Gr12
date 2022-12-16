/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmi.GradeInterface;
import rminewclient.BookRoom;

/**
 *
 * @author reemf011
 */
public class BookRoomController {
        
    // We have reference to both the GUI and the rmi registry
    BookRoom gui;
    Registry r;

    //create a constructor
    public BookRoomController(BookRoom gui, Registry r) {
        this.gui = gui;
        this.r = r;
    }
    
    
    
    
}
