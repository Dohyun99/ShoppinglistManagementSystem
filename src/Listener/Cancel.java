package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.Gui;
import gui.Listadder;
import gui.Listviewer;
import gui.WindowFrame;

public class Cancel implements ActionListener {

	
	WindowFrame frame;
	
	public Cancel(WindowFrame frame) {
		this.frame = frame;
	} 
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b= (JButton)e.getSource();
		Gui adder = frame.getG();
		frame.setupPanel(adder);

	}

}
