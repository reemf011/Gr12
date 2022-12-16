/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ChooseCarController {
      //ChooseCarGui obj = new ChooseCarGui();
        //obj.show();
    
    int StudentID;
    ChooseCarGui gui;
    Registry r;

    public EnrollToCourseController(int StudentID,EnrollToCourseStudent gui, Registry r) throws RemoteException, NotBoundException{
        this.StudentID=StudentID;
        this.gui = gui;
        this.r = r;
        gui.setSize(750, 640);
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FillTable();
        
        gui.getEnrollBtn().addActionListener(new EnrollAction());
        gui.getBackBtn().addActionListener(new BackAction());
    }

    public void FillTable() throws RemoteException, NotBoundException{
        StudentCourseReadOnly course = (StudentCourseReadOnly) r.lookup("StudentCourse");
        ArrayList<String> x = course.ViewAcceptedCourses();
        DefaultTableModel tblModel = (DefaultTableModel) gui.getjTable1().getModel();
        for (int r=0;r<x.size();r++) {
            Document d = Document.parse(x.get(r));
            String data[] = {d.get("ID").toString(),d.get("Code").toString(),d.get("Title").toString(), d.get("Description").toString(), d.get("ProfessorID").toString(),d.get("NumHrs").toString(),d.get("Capacity").toString()};
            tblModel.insertRow(r,data);
        }

    }

    class EnrollAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                int id = parseInt(gui.getCourseIDField().getText());
                CourseInterface course = (CourseInterface) r.lookup("Course");
                gui.setErrorLabel(course.EnrollCourse(StudentID, id));

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
                    StudentMainWindowController guiController = new StudentMainWindowController(StudentID, new StudentMenu(), r);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }

}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
