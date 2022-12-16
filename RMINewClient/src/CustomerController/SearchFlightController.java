/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import ALLGUI.SearchFlight;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rmi.BookFlightInterface;
import rmi.LogInInterface;
import rminewclient.Login;
import rminewclient.SignUpp;
//import rmi.CourseFacadeInterface;
//import rmi.CourseInterface;
//import rmi.StaffInterface;

/**
 *
 * @author note book
 */
public class SearchFlightController {
     SearchFlight gui;
    Registry r;
    
    public SearchFlightController(SearchFlight gui, Registry r) {
        this.gui = gui;
        gui.setSize(750, 640);
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
        this.r = r;
        gui.getjButton1().addActionListener(new SearchAction());
    }

    class SearchAction implements ActionListener {

        private Object user;

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                String Arrival = gui.getjComboBox1().getActionCommand();
                String Departure = gui.getjComboBox2().getActionCommand();
                String SeatType = gui.getjComboBox3().getActionCommand();
                String Date = gui.getjTextField1().getText();
                String Time = gui.getjTextField2().getText();
                
               

                BookFlightInterface acc = (BookFlightInterface) r.lookup("Flight");


            } catch (Exception e) {
                gui.setErrorLabel(e.getMessage());
            }
        }
    }
}