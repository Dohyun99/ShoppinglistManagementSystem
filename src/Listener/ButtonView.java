package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.Listviewer;
import gui.WindowFrame;

public class ButtonView implements ActionListener {

	
	WindowFrame frame;
	
	public ButtonView(WindowFrame frame) {
		this.frame = frame;
	} 
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b= (JButton)e.getSource();
		Listviewer viwer = frame.getV();
		frame.setupPanel(viwer);

	}

}
