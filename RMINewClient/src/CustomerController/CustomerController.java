/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerController;

//import roommanager.Options;
import CustomerGUi.CustomerMenu;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import rmi.RoomManager;

public class CustomerController extends JFrame{
    
    private JPanel contentPane;
    private JTable table;
    private JLabel label1;
    private JButton btn1;
    
    public CustomerController() throws RemoteException, NotBoundException {
		super("Customer list");
		
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1000, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(40, 5, 40, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBackground(Color.decode("#FFE4B5"));
		setContentPane(contentPane);
                
                btn1 = new JButton("Back");
                btn1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                           // Options n = new Options();
                          //  n.setVisible(true);
                        }
                   });
			
		
		String data[][]=null;
		String column[]=null;
		
		Registry reg = LocateRegistry.getRegistry("127.0.0.1",1099);
                RoomManager rm = (RoomManager)reg.lookup("HelloService");
                
                data= rm.getListData();
                column = rm.getListColumn();
		
		
		table = new JTable(data,column);
                table.setSize(400,500);
		JScrollPane sp=new JScrollPane(table);
		label1= new JLabel("Guest List", SwingConstants.CENTER);
                label1.setFont(new Font("Helvetica", Font.BOLD, 20));
                label1.setSize(1000, 50);
                btn1.setSize(100, 50);
                contentPane.add(label1);
                contentPane.add(btn1, BorderLayout.SOUTH);
		contentPane.add(sp, BorderLayout.CENTER);
                
	}

    CustomerController(int CustomerID, CustomerMenu customerMenu, Registry r) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
