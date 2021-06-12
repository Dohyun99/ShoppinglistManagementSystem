package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.Listeditter;
import gui.Listviewer;
import gui.WindowFrame;

public class ButtonEditter implements ActionListener {

	
	WindowFrame frame;
	
	public ButtonEditter(WindowFrame frame) {
		this.frame = frame;
	} 
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b= (JButton)e.getSource();
		Listeditter edit = frame.getE();
		frame.setupPanel(edit);

	}

}
