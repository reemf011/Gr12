/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerController;

import CustomerController.CustomerMenuController;
import CustomerGUi.EditProfileCustomer;
import CustomerGUi.CustomerMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.registry.Registry;
import javax.swing.JFrame;
import rmi.CustomerInterface;
import rmi.UserInterface;

/**
 *
 * @author reemf011
 */
public class EditProfileController {


    int UserID;
    EditProfileCustomer gui;
    Registry r;

    public EditProfileController(int UserID, EditProfileCustomer gui, Registry r) {
        this.UserID=UserID;
        this.gui = gui;
        this.r = r;
        gui.setSize(750, 640);
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        gui.getjButton2().addActionListener(new EditAccountAction());
        gui.getjButton1().addActionListener(new BackAction());
    }
    
    class EditAccountAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                String email=gui.getjTextField5().getText();
                String userName = gui.getjTextField1().getText();
                String Opassword = gui.getjTextField4().getText();
                String Newpass = gui.getjTextField3().getText();
                String OlduserName= gui.getjTextField2().getText();

                UserInterface acc = (UserInterface) r.lookup("Customer");
                
                if(acc.EditUser(UserID, email, OlduserName, userName,Newpass,Opassword, "Customer")){
                    gui.setErrorLabel("Account Updated Successfully!");
                }else{
                    gui.setErrorLabel("Something went wrong, Please check your input Data");
                }

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
                    CustomerMenuController guiController = new CustomerMenuController(UserID,new CustomerMenu(), r);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
   
    
}


