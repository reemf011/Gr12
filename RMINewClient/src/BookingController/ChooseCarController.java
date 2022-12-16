/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 import rmi.CustomerBookingROI;
/**
 *
 * @author user
 */
public class ChooseCarController {
      //ChooseCarGui obj = new ChooseCarGui();
        //obj.show();
    
    int car_id;
    ChooseCarTable gui;
    Registry r;

    public ChooseCarController(int car_id, ChooseCarTable gui, Registry r) throws RemoteException, NotBoundException{
        this.car_id=car_id;
        this.gui = gui;
        this.r = r;
        gui.setSize(750, 640);
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FillTable();
        
        gui.getBookCarbtn().addActionListener(new CarBooking());
    }

    public void FillTable() throws RemoteException, NotBoundException{
        CustomerBookingROI book = (CustomerBookingROI) r.lookup("book");
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
                CustomerBookingROI book = (CustomerBookingROI) r.lookup("car");
                gui.setErrorLabel(book.AddBooking(car_id, id));

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
    
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
