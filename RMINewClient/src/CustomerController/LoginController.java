/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerController;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.registry.Registry;

import rmi.CustomerInterface;
import rmi.LogInInterface;
import CustomerGUi.Login;
import CustomerGUi.SignUpp;
import java.rmi.registry.LocateRegistry;
import javax.swing.JOptionPane;


/**
 *
 * @author dell
 */
public class LoginController {

    Login gui;
    Registry r;
    
    public LoginController(Login gui, Registry r) {
        this.gui = gui;
        gui.setSize(750, 640);
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
        this.r = r;
       
        gui.getjButton1().addActionListener(new LoginAction());
        gui.getSignupBtn().addActionListener(new SignupAction());
    }


    class LoginAction implements ActionListener {
        String c;
        boolean credentials = false; 
        @Override
        public void actionPerformed(ActionEvent ae) {
        try {
            Registry reg = LocateRegistry.getRegistry("127.0.0.1", 1099);
            LogInInterface li = (LogInInterface)reg.lookup("login");
            if(credentials == false){
            c = li.login( gui.getjTextField2().getText(), gui.getjTextField1().getText());
            }
            if(credentials==true) {
                JOptionPane.showMessageDialog(null, "Login Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Login Failed");
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        }
        /*
      
       
            try {
                String userName = gui.getjTextField2().getText();
                String password = gui.getjTextField1().getText();
               

                LogInInterface acc = (LogInInterface) r.lookup("Account");

                String id = acc.login(userName, password);

            } catch (Exception e) {
                gui.setErrorLabel(e.getMessage());
            }

        }
*/
    }

    class SignupAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                gui.setVisible(false);
                SignUpControllers guiController = new SignUpControllers(new SignUpp(), r);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
