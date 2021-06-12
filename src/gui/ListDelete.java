package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ListDelete extends JPanel {
	
	WindowFrame frame;

	public ListDelete(WindowFrame frame) { 
		this.frame=frame;
		
		JPanel pan1 = new JPanel();
		pan1.setLayout(new SpringLayout());
		
		JLabel labellist = new JLabel("What is list you want to delete? : ", JLabel.TRAILING);
		JTextField fieldlist = new JTextField(10);
		labellist.setLabelFor(fieldlist);//label과textfield를 넣어준다.
		pan1.add(labellist);
		pan1.add(fieldlist);

		
		pan1.add(new JButton("Delete"));
		pan1.add(new JButton("cancle"));
		
		AddressBook.makeCompactGrid(pan1, 2, 2, 6, 6, 6, 6);
		

		this.add(pan1);//
		this.setVisible(true);
		
	}
}
