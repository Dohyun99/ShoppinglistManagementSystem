package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Manumanager.Manu;
import list.Listinput;

public class Listviewer extends JPanel{
	
	WindowFrame frame; 

	Manu manu;
	
	public Listviewer(WindowFrame frame, Manu manu) {
		this.frame=frame;
		this.manu=manu;
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("kind of list");
		model.addColumn("list");
		model.addColumn("market price");
		model.addColumn("intermet price");
		model.addColumn("which is cheeper");
		
		for(int i=0; i <manu.size(); i++) {
			Vector row = new Vector();
			Listinput si=manu.get(i);
			row.add(si.getKind());
			row.add(si.getList());
			row.add(si.getPrice());
			row.add(si.getPrice2());
			row.add(si.getLocate());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);

		
	}
}
