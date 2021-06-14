package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Manumanager.Manu;

public class WindowFrame extends JFrame{
	
	Gui g;
	Listadder l;
	Listeditter e;
	Listviewer v;
	ListDelete d;
	Manu manu;
	
	
	public WindowFrame( Manu manu) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		this.manu=manu;
		
		g=new Gui(this);
		l=new Listadder(this, this.manu);
		e=new Listeditter(this);
		v = new Listviewer(this, this.manu);
		d=new ListDelete(this);
		
		
		
	
		this.setupPanel(g);
		
		this.setVisible(true);
		
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public Gui getG() {
		return g;
	}

	public void setG(Gui g) {
		this.g = g;
	}

	public Listadder getL() {
		return l;
	}

	public void setL(Listadder l) {
		this.l = l;
	}

	public Listeditter getE() {
		return e;
	}

	public void setE(Listeditter e) {
		this.e = e;
	}

	public Listviewer getV() {
		return v;
	}

	public void setV(Listviewer v) {
		this.v = v;
	}
	
	public ListDelete getD() {
		return d;
	}

	public void setD(ListDelete d) {
		this.d = d;
	}


}
