package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gui extends JFrame {

	public Gui() {
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel1= new JPanel();
		JPanel panel2= new JPanel();
		JLabel l = new JLabel("menu selection");
		
		JButton b1= new JButton("add shopping list");
		JButton b2= new JButton("view shopping list");
		JButton b3= new JButton("edit shopping list");
		JButton b4= new JButton("delete shopping list");
		JButton b5= new JButton("exit");
		
		panel1.add(l);
		panel2.add(b1);
		panel2.add(b2);
		panel2.add(b3);
		panel2.add(b4);
		panel2.add(b5);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		this.setVisible(true);
		
		
		
	}
}
