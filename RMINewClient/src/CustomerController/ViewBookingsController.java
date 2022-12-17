/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerController;

import StudentController.StudentMainWindowController;
import StudentController.StudentViewContentController;
import StudentGUI.CoursesContentStudents;
import StudentGUI.StudentMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import CustomerGUi.viewBookings;
import rmi.CustomerBookingROI;
import rmi.CustomerInterface;
import CustomerGUi.CustomerMenu;

/**
 *
 * @author reemf011
 */
public class ViewBookingsController {

    int UserID;
    viewBookings gui;
    Registry r;
    public ViewBookingsController(int UserID,viewBookings gui, Registry r) throws RemoteException, NotBoundException {
        this.UserID=UserID;
        this.gui = gui;
        this.r = r;
        gui.setSize(750, 640);
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FillTable();
        
        gui.getViewBookingBtm().addActionListener(new ViewBookingAction());
        gui.getDropBookingBtn().addActionListener(new DropAction());
        gui.getBackBtn().addActionListener(new BackAction());
    }
    
    public void FillTable() throws RemoteException, NotBoundException{
        CustomerInterface cust = (CustomerInterface) r.lookup("Customer");
        ArrayList<String> x = cust.ViewBookings(UserID);
        DefaultTableModel tblModel = (DefaultTableModel) gui.getjTable1().getModel();
        for (int r=0;r<x.size();r++) {
            Document d = Document.parse(x.get(r));
            String data[] = {d.get("ID").toString(),d.get("Booking").toString()};
            tblModel.insertRow(r,data);
        }

    }
    
    
    class ViewBookingAction implements ActionListener{

        @Override
       
        public void actionPerformed(ActionEvent ae) {
            try{
                int BookingID=parseInt(gui.getBookingIDField().getText());
                gui.setVisible(false);
            //   ViewBookingsController guiController= new ViewBookingsController(BookingID,UserID,new BookingContent(),r);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
          
        }
    }
    
    
    class DropAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            try{
                int BookingID=parseInt(gui.getBookingIDField().getText());
                CustomerBookingROI booking = (CustomerBookingROI) r.lookup("CustomerBooking");
                gui.setErrorLabel(booking.CancleBooking(UserID, BookingID));
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
          
        }
    }
    
    class BackAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                
                    gui.setVisible(false);
                    CustomerMenuController guiController = new CustomerMenuController(UserID,new CustomerMenu(), r);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
    
}


