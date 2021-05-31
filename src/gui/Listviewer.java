package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Listviewer extends JFrame{

	public Listviewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("kind of list");
		model.addColumn("market price");
		model.addColumn("intermet price");
		model.addColumn("which is cheeper");
		
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}
