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
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import rmi.BookingFacadeInterface;
import rmi.CustomerBookingReadOnly;
import BookingGUi.BookRoom;
import CustomerGUi.MainMenu;
import CustomerGUi.CustomerMenu;
import CustomerController.MainMenuController;
import CustomerController.MainMenuController;
import javax.swing.JFrame;

import BookingGUi.BookRoom;

/**
 *
 * @author reemf011
 */
public class BookRoomController {
        
    // We have reference to both the GUI and the rmi registry
    int UserID;
    BookRoom gui;
    Registry r;

    //create a constructor
    public BookRoomController(BookRoom gui, Registry r) {
        this.gui = gui;
        this.r = r;
    }
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




    public BookRoomController(int UserID,BookRoom gui, Registry r) throws RemoteException, NotBoundException{
        this.UserID=UserID;
        this.gui = gui;
        this.r = r;
        gui.setSize(750, 640);
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FillTable();
        
        gui.getjButtonBook().addActionListener(new BookAction());
        gui.getjButtonBack().addActionListener(new BackAction());
    }

    public void FillTable() throws RemoteException, NotBoundException{
        CustomerBookingReadOnly hotel = (CustomerBookingReadOnly) r.lookup("CustomerHotelBooking");
        ArrayList<String> x = hotel.ViewAccepted();
        DefaultTableModel tblModel = (DefaultTableModel) gui.getjTable2().getModel();
        for (int r=0;r<x.size();r++) {
            Document d = Document.parse(x.get(r));
            String data[] = {d.get("Number").toString(),d.get("UnitType").toString()};
            tblModel.insertRow(r,data);
        }

    }

    class BookAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                int id = parseInt(gui.getjTextField1().getText());
               BookingFacadeInterface booking = (BookingFacadeInterface) r.lookup("Car");
                gui.setErrorLabel(booking.SetBookingData(UserID, id));

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
    
    class BackAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                    gui.setVisible(false);
                   MainMenuController guiController = new MainMenuController(UserID, new CustomerMenu(), r);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }

}

    
    
    
}
