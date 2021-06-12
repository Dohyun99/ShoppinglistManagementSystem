package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.Listadder;
import gui.Listviewer;
import gui.WindowFrame;

public class ButtonAdder implements ActionListener {

	
	WindowFrame frame;
	
	public ButtonAdder(WindowFrame frame) {
		this.frame = frame;
	} 
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b= (JButton)e.getSource();
		Listadder adder = frame.getL();
		frame.setupPanel(adder);

	}

}
