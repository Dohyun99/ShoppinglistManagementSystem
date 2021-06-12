package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.ListDelete;
import gui.Listadder;
import gui.Listviewer;
import gui.WindowFrame;

public class ButtonDelete implements ActionListener {

	
	WindowFrame frame;
	
	public ButtonDelete(WindowFrame frame) {
		this.frame = frame;
	} 
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b= (JButton)e.getSource();
		ListDelete delete = frame.getD();
		frame.setupPanel(delete);

	}

}
