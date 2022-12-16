/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.registry.Registry;
import rmi.LogInInterface;
import CustomerGUi.Login;
import CustomerGUi.SignUpp;
import javax.swing.JFrame;

/**
 *
 * @author Ahmed
 */
public class SignUpControllers {

    SignUpp gui;
    Registry r;

    public SignUpControllers(SignUpp gui, Registry r) {
        this.gui = gui;
        this.r = r;
        gui.setSize(750, 640);
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        gui.getjButton1().addActionListener(new SignupAction());
        gui.getBackBtn().addActionListener(new BackAction());
    }

    class SignupAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                String userName = gui.getjTextField1().getText();
                String password = gui.getjTextField2().getText();
                String mail = gui.getjTextField3().getText();
                String Conpassword = gui.getjTextField4().getText();
                

                if (password.equals(Conpassword)) {
                    LogInInterface acc = (LogInInterface) r.lookup("Account");
                    if (acc.AddnewAccount(userName, password, mail)) {
                        gui.setErrorLabel("Account Created Successfully");
                    } else {
                        gui.setErrorLabel("Username Already in use");
                    }
                }
            } catch (Exception e) {
                gui.setErrorLabel(e.getMessage());
            }

        }

    }

    class BackAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            gui.setVisible(false);
            LoginController LoginController = new LoginController(new Login(), r);
        }

    }
}
