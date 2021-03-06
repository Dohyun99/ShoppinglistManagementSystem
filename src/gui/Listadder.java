package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Listener.Cancel;
import Listener.ListAddListener;
import Manumanager.Manu;

public class Listadder extends JPanel {
	
	WindowFrame frame;
	
	Manu manu;

	public Listadder(WindowFrame frame,  Manu manu) { 
		this.frame=frame;
		this.manu=manu;
		
		JPanel pan1 = new JPanel();
		pan1.setLayout(new SpringLayout());
		
		JLabel labellist = new JLabel("Select 1.food or 2.stuff: ", JLabel.TRAILING);
		JTextField fieldlist = new JTextField(10);
		labellist.setLabelFor(fieldlist);//label과textfield를 넣어준다.
		pan1.add(labellist);
		pan1.add(fieldlist);
		

		JLabel labelname = new JLabel("List name: ", JLabel.TRAILING);
		JTextField fieldname = new JTextField(10);
		labellist.setLabelFor(fieldname);//label과textfield를 넣어준다.
		pan1.add(labelname);
		pan1.add(fieldname);

		JLabel labelprice1 = new JLabel("Market price: ", JLabel.TRAILING);
		JTextField fieldprice1 = new JTextField(10);
		labellist.setLabelFor(fieldprice1);//label과textfield를 넣어준다.
		pan1.add(labelprice1);
		pan1.add(fieldprice1);
		
		JLabel labelprice2 = new JLabel("Internet price: ", JLabel.TRAILING);
		JTextField fieldprice2 = new JTextField(10);
		labellist.setLabelFor(fieldprice2);//label과textfield를 넣어준다.
		pan1.add(labelprice2);
		pan1.add(fieldprice2);
		
		JLabel labelc = new JLabel("Which is cheeper?: ", JLabel.TRAILING);
		JTextField fieldc = new JTextField(10);
		labellist.setLabelFor(fieldc);//label과textfield를 넣어준다.
		JButton savebutton = new JButton("save");
		JButton cancelbutton = new JButton("cancel");

		
		savebutton.addActionListener(new ListAddListener(fieldlist, fieldname, fieldprice1, fieldprice2, fieldc, manu));
		cancelbutton.addActionListener(new Cancel(frame));
		pan1.add(labelc); 
		pan1.add(fieldc);
		
		pan1.add(savebutton);
		pan1.add(cancelbutton);
		
		AddressBook.makeCompactGrid(pan1, 6, 2, 6, 6, 6, 6);
		

		this.add(pan1);//
		this.setVisible(true);
		
	}
}
