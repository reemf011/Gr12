/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import javax.swing.JFrame;
import rmi.CustomerInterface;
import rmi.EditProfileCustomer;
import BookingGUi.BookRoom;
//import StudentGUI.EvaluationStudent;
import CustomerGUi.Login;
import CustomerGUi.CustomerMenu;
import rminewclient.viewBookings;


/**
 *
 * @author reemf011
 */
public class MainMenuController {
  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author dell
 */
public class StudentMainWindowController {
    int StudentID;
    CustomerMenu gui;
    Registry r;
    
    public StudentMainWindowController(int StudentID,StudentMenu gui, Registry r) throws RemoteException, NotBoundException {
        this.StudentID=StudentID;
        this.gui = gui;
        gui.setIDlabel(StudentID);
        StudentInterface student = (StudentInterface) r.lookup("Student");
        gui.setSize(750, 640);
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.r = r;
        
        gui.getViewCoursesBtn().addActionListener(new ViewCourseAction());
        gui.getEditProfileBtn().addActionListener(new EditProfileAction());
        gui.getCourseEnrollBtn().addActionListener(new EnrollAction());
        gui.getLogoutBtn().addActionListener(new LogoutAction());
        gui.getTranscriptsBtn().addActionListener(new TranscriptAction());
        gui.getEvaluateBtn().addActionListener(new EvaluationAction());
    }

    class ViewCourseAction implements ActionListener {

        @Override

        public void actionPerformed(ActionEvent ae) {
            try {
                gui.setVisible(false);
                EnrolledCoursesWindowController guiController2 = new EnrolledCoursesWindowController(StudentID,new ViewEnrolledCoursseStudent(), r);
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
                EditProfileController guiController3 = new EditProfileController(StudentID,new EditProfileStudent(), r);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
    
    class EnrollAction implements ActionListener {

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
    
    class TranscriptAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                gui.setVisible(false);
                TranscriptController transcriptController = new TranscriptController(StudentID,new TranscriptStudent(), r);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
    }
    
    class EvaluationAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                gui.setVisible(false);
                EvaluationController evaluationController = new EvaluationController(StudentID,new EvaluationStudent(), r);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
    }

    class LogoutAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            gui.setVisible(false);
            LoginController LoginController = new LoginController(new LoginWindow(),r);
        }

    }

}
  
}
