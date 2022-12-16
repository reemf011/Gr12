/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerController;

import BookingController.BookRoomController;
import BookingController.ChooseCarController;
import BookingController.SearchFlightController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import javax.swing.JFrame;
import rmi.CustomerInterface;
import CustomerGUi.EditProfileCustomer;
import BookingGUi.BookRoom;
import BookingGUi.ChooseCarTable;
import BookingGUi.SearchFlight;
//import StudentGUI.EvaluationStudent;
import CustomerGUi.Login;
import CustomerGUi.CustomerMenu;
import CustomerGUi.viewBookings;
import CustomerController.ViewBookingsController;
import BookingController.SearchFlightController;


/**
 *
 * @author reemf011
 */
public class CustomerMenuController {

    int UserID;
    CustomerMenu gui;
    Registry r;
    
    public CustomerMenuController(int UserID,CustomerMenu gui, Registry r) throws RemoteException, NotBoundException {
        this.UserID=UserID;
        this.gui = gui;
        gui.setjLabel5(UserID);
        CustomerInterface customer = (CustomerInterface) r.lookup("Customer");
        gui.setSize(750, 640);
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.r = r;
        
        gui.getjButton5().addActionListener(new ViewBookingAction());
        gui.getjButton1().addActionListener(new BookingAction1());
        gui.getjButton2().addActionListener(new BookingAction2());
        gui.getjButton3().addActionListener(new BookingAction3());
        gui.getjButton4().addActionListener(new BookingAction3());
        gui.getLogoutBtn().addActionListener(new LogoutAction());
        gui.getEditProfileBtn().addActionListener(new EditProfileAction());

    }

    class ViewBookingAction implements ActionListener {

        @Override

        public void actionPerformed(ActionEvent ae) {
            try {
                gui.setVisible(false);
                ViewBookingsController guiController2 = new ViewBookingsController(UserID,new viewBookings(), r);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }

    class EditProfileAction implements ActionListener {

        @Override

        public void actionPerformed(ActionEvent ae) {
            try {
                gui.setVisible(false);
                EditProfileController guiController3 = new EditProfileController(UserID,new EditProfileCustomer(), r);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
    
    class BookingAction1 implements ActionListener {

        @Override

        public void actionPerformed(ActionEvent ae) {
            try {
                gui.setVisible(false);
                ChooseCarController guiController4 = new ChooseCarController(UserID,new ChooseCarTable(), r);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
        class BookingAction2 implements ActionListener {

        @Override

        public void actionPerformed(ActionEvent ae) {
            try {
                gui.setVisible(false);
                SearchFlightController guiController5 = new SearchFlightController(UserID,new SearchFlight(), r);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
            class BookingAction3 implements ActionListener {

        @Override

        public void actionPerformed(ActionEvent ae) {
            try {
                gui.setVisible(false);
                BookRoomController guiController6 = new BookRoomController(UserID,new BookRoom(), r);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
            
    class BookingAction4 implements ActionListener {

        @Override

        public void actionPerformed(ActionEvent ae) {
            try {
                gui.setVisible(false);
                EnrollToCourseController guiController3 = new EnrollToCourseController(StudentID,new EnrollToCourseStudent(), r);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
    


    class LogoutAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            gui.setVisible(false);
            LoginController LoginController = new LoginController(new Login(),r);
        }

    }

}
  

