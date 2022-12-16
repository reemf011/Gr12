/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.registry.Registry;
import rmi.LogInInterface;
import rmi.CustomerInterface;
import rminewclient.Login;
import rminewclient.SignUpp;


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

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                String userName = gui.getjTextField2().getText();
                String password = gui.getjTextField1().getText();
               

                LogInInterface acc = (LogInInterface) r.lookup("Account");

                String id = acc.login(userName, password);

            } catch (Exception e) {
                gui.setErrorLabel(e.getMessage());
            }

        }

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
