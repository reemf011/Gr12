/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookingController;

import BookingGUi.ChooseCarTable;
import BookingGUi.SearchFlight;
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
import CustomerGUi.Login;
import CustomerGUi.SignUpp;
import static java.lang.Integer.parseInt;
import javax.swing.text.Document;
//import rmi.CourseFacadeInterface;
//import rmi.CourseInterface;
//import rmi.StaffInterface;

/**
 *
 * @author note book
 */
public class SearchFlightController {
     //SearchFlight gui;
    //Registry r;
    
        int FlightID;
    SearchFlightController gui;
    Registry r;
    
    public SearchFlightController(int FlightID, SearchFlight gui, Registry r) throws RemoteException, NotBoundException{        
        
        this.FlightID=FlightID;
        this.gui = gui;
        this.r = r;
        gui.setSize(750, 640);
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FillTable();
    }

    private void setErrorLabel(String message) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void FillTable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void FillTable() throws RemoteException, NotBoundException{
        CustomerBookingInterface book = (CustomerBookingInterface) r.lookup("Car");
        ArrayList<String> x = book.ViewBooking();
        DefaultTableModel tblModel = (DefaultTableModel) gui.getjTable1();
        for (int r=0;r<x.size();r++) {
            Document d = Document.parse(x.get(r));
            String data[] = {d.get("FlightID").toString(),d.get("Departure").toString(),d.get("Arrival").toString(), d.get(" Seat Type").toString(), d.get("Date"), d.get("Time")};
            tblModel.insertRow(r,data);
        }

    }

    private Object getjTable1() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    /*
    
        
        gui.getBookCarbtn().addActionListener(new CarBooking());
    }

    public void FillTable() throws RemoteException, NotBoundException{
        CustomerBookingInterface book = (CustomerBookingInterface) r.lookup("Car");
        ArrayList<String> x = book.ViewBooking();
        DefaultTableModel tblModel = (DefaultTableModel) gui.getjTable1().getModel();
        for (int r=0;r<x.size();r++) {
            Document d = Document.parse(x.get(r));
            String data[] = {d.get("Car_id").toString(),d.get("Price").toString(),d.get("Car_model").toString(), d.get(" Rental_Duration").toString(), d.get("Year_of_Production")};
            tblModel.insertRow(r,data);
        }

    }

    class CarBooking implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                int id = parseInt(gui.getjTextField1().getText());
                CustomerBookingInterface course = (CustomerBookingInterface) r.lookup("car");
                gui.setErrorLabel(course.CarBooking(car_id, id));

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
    
    
}
    
    

    */

}
    
