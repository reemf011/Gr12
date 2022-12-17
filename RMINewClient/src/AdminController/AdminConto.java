/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminController;
import AdminGui.Admin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import rmi.BookingFacadeInterface;

/**
 *
 * @author user
 */
public class AdminConto   {
 
    int UserID;
    Admin gui;
    Registry r;
    
    
    public AdminConto(Admin gui, Registry r) {
        this.gui = gui;
        this.r = r;
    }
    
    
    
     public AdminConto(int UserID,Admin gui, Registry r) throws RemoteException, NotBoundException{
        this.UserID=UserID;
        this.gui = gui;
        this.r = r;
        gui.setSize(750, 640);
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FillTable();
        
        gui.getConfirmButton().addActionListener(new AdminConto.ConfirmAction());
    }
    
    
    public void FillTable() throws RemoteException, NotBoundException{
        BookingFacadeInterface hotel = (BookingFacadeInterface) r.lookup("AdminViewBooking");
        ArrayList<String> x = hotel.getBookingData();
        DefaultTableModel tblModel = (DefaultTableModel) gui.getjTable2().getModel();
        for (int r=0;r<x.size();r++) {
            Document d = Document.parse(x.get(r));
            String data[] = {d.get("Number").toString(),d.get("UnitType").toString()};
            tblModel.insertRow(r,data);
        }

    }
    
    
    class ConfirmAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                int id = parseInt(gui.getjTextField1().getText());
               BookingFacadeInterface booking = (BookingFacadeInterface) r.lookup("ViewBooking");

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
    
    
    
    
    
    
    
}
