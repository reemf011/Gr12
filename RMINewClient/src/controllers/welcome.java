/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

/**
 *
 * @author note book
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Welcome extends JFrame
{
	Container cn;
	JLabel welcome_msg;
	Welcome()
	{
		setTitle("Welcome");
		cn=getContentPane();
		setLayout(null);
		welcome_msg= new JLabel("Welcome to Airlines!");welcome_msg.setBounds(210,250,200,20);cn.add(welcome_msg);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent ae)
			{System.exit(0);}
		});
		addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent ae)
			{	
				setVisible(false);
				//new CheckSeats();
			}
		});
		setSize(600,600);
		setVisible(true);	
	}
	public static void main(String args[])
	{
		new Welcome();
	}
}

