package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Listadder extends JFrame {

	public Listadder() {
		JPanel pan1 = new JPanel();
		pan1.setLayout(new SpringLayout());
		
		JLabel labellist = new JLabel("Select 1.food or 2.stuff: ", JLabel.TRAILING);
		JTextField fieldlist = new JTextField(10);
		labellist.setLabelFor(fieldlist);//label과textfield를 넣어준다.
		pan1.add(labellist);
		pan1.add(fieldlist);

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
		pan1.add(labelc);
		pan1.add(fieldc);
		
		pan1.add(new JButton("save"));
		pan1.add(new JButton("cancle"));
		
		AddressBook.makeCompactGrid(pan1, 5, 2, 6, 6, 6, 6);
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(pan1);
		this.setVisible(true);
		
	}
}
