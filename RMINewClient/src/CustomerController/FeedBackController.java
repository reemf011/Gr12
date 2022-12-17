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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import rmi.FeedBackInterface;
import CustomerGUi.StudentFeedBack;
import CustomerGUi.CustomerMenu;
import javax.swing.JFrame;


 class FeedBackController {

    int CustomerID;
    StudentFeedBack gui;
    Registry r;

    public FeedBackController(int CustomerID, StudentFeedBack gui, Registry r) throws RemoteException, NotBoundException {
        this.CustomerID = CustomerID;
        this.gui = gui;
        gui.setSize(750, 640);
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.r = r;
        
        FillTable();

        gui.getSubmitBtn().addActionListener(new EvaluateAction());
        gui.getBackBtn().addActionListener(new BackAction());
    }

    public void FillTable() throws RemoteException, NotBoundException {

        FeedBackInterface t = (FeedBackInterface) r.lookup("Feedback");

        ArrayList<String> x = t.ViewAll(CustomerID);

        System.out.println(CustomerID);

        DefaultTableModel tblModel = (DefaultTableModel) gui.getjTable1().getModel();

        for (int r = 0; r < x.size(); r++) {
            Document d = Document.parse(x.get(r));
            String data[] = {d.get("CustomerID").toString(), d.get("date").toString(), d.get("Rate").toString(),  d.get("Complain").toString()};
            tblModel.insertRow(r, data);
        }

    }

    class EvaluateAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                int CustomerID = Integer.parseInt(gui.getCourseIDField().getText());
                String Date = gui.getDateField().getText();
                int Rate = Integer.parseInt(gui.getTaRateField().getText());
                String Complains = gui.getCommentsField().getText();

                FeedBackInterface feedBackInterface = (FeedBackInterface) r.lookup("FeedBack");

                feedBackInterface.AddNewFeedBack(CustomerID, Date, Rate, Complains);

                JOptionPane.showMessageDialog(gui, "Successful Add the Evaluation");
                FillTable();
            } catch (RemoteException ex) {
                Logger.getLogger(FeedBackController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NotBoundException ex) {
                Logger.getLogger(FeedBackController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    class BackAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                gui.setVisible(false);
                CustomerController guiController = new CustomerController(CustomerID, new CustomerMenu(), r);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }

}
