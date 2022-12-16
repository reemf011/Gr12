/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookingController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
 import BookingGUi.ChooseCarTable;
import BookingGUi.SearchFlight;
 import rmi.CustomerBookingROI;


/**
 *
 * @author note book
 */
public class SearchFlightController {
      //ChooseCarGui obj = new ChooseCarGui();
        //obj.show();
    
    int UserID;
    SearchFlight gui;
    Registry r;

    public SearchFlightController(int UserID, SearchFlight gui, Registry r) throws RemoteException, NotBoundException{
        this.UserID=UserID;
        this.gui = gui;
        this.r = r;
        gui.setSize(750, 640);
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FillTable();
        
        gui.getjButton1().addActionListener(new FlightBooking());
    }

    public void FillTable() throws RemoteException, NotBoundException{
        CustomerBookingROI book = (CustomerBookingROI) r.lookup("book");
       ArrayList<String> x = book.ViewBooking();
        DefaultTableModel tblModel = (DefaultTableModel) gui.getjTable1().getModel();
        for (int r=0;r<x.size();r++) {
            Document d = Document.parse(x.get(r));
            String data[] = {d.get("Flight Number").toString(),d.get("DepartureDate").toString(),d.get("ArrivalDate").toString(), d.get(" SeatType").toString(), d.get("Date"), d.get("Time")};
            tblModel.insertRow(r,data);
        }

    }

    class FlightBooking implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                int id = parseInt(gui.getjTextField1().getText());
                CustomerBookingROI book = (CustomerBookingROI) r.lookup("Flight");
                gui.setErrorLabel(book.AddBooking(UserID, id));

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
    
    
}
    
    

