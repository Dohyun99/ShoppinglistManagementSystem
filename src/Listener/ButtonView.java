package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;import Manumanager.Manu;
import gui.Listviewer;
import gui.WindowFrame;

public class ButtonView implements ActionListener {

	
	WindowFrame frame;
	
	public ButtonView(WindowFrame frame) {
		this.frame = frame;
	} 
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Listviewer viwer = frame.getV();
		Manu manu = getObject("manu.ser");
		viwer.setManu(manu);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(viwer);
		frame.revalidate();
		frame.repaint();
		


	}

	public static Manu getObject(String fileName) {
		Manu manu=null;
		try {
			FileInputStream	file = new FileInputStream(fileName);
			ObjectInputStream in=new ObjectInputStream(file);
			
			manu = (Manu) in.readObject();//(Manu)는 Manu 타입으로 형형변환 해주는것
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return manu;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return manu;
	}
}
