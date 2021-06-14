package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Exceptions.Price2Exception;
import Manumanager.Manu;
import list.Food;
import list.List;
import list.Listinput;
import list.Listkind;
import list.Stuff;

public class ListAddListener implements ActionListener {
	JTextField fieldlist;
	JTextField fieldname;
	JTextField fieldprice1;
	JTextField fieldprice2;
	JTextField fieldc;
	Manu manu;
	
	public ListAddListener(JTextField fieldlist, JTextField fieldname, JTextField fieldprice1, JTextField fieldprice2,
			JTextField fieldc, Manu manu) {//생성자에서 5개의 field를 가져옴
		this.fieldlist = fieldlist;
		this.fieldname = fieldname;
		this.fieldprice1 = fieldprice1;
		this.fieldprice2 = fieldprice2;
		this.fieldc = fieldc;
		this.manu=manu;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int a=Integer.parseInt(fieldlist.getText());
		if(a==1) {
			Listinput list = new Food(Listkind.food);
			try {
			list.setList(fieldname.getText());
			list.setPrice(fieldprice1.getText());
			list.setPrice2(fieldprice2.getText());
			list.setLocate(fieldc.getText());
			manu.add(list);
			putObject(manu, "manu.ser");//seriallization 추가
			list.printin();
		} 
			catch (Price2Exception e1) {
			e1.printStackTrace();
			}
		}
		if(a==2) {
			Listinput list2 = new Stuff(Listkind.stuff);
			try {
				list2.setList(fieldname.getText());
				list2.setPrice(fieldprice1.getText());
				list2.setPrice2(fieldprice2.getText());
				list2.setLocate(fieldc.getText());
				manu.add(list2);
				putObject(manu, "manu.ser");//seriallization 추가
				list2.printin();
			} 
				catch (Price2Exception e1) {
				e1.printStackTrace();
				}
		}
		
	} 
	public static void putObject(Manu manu, String fileName) {
		try { 
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out=new ObjectOutputStream(file);
			
			out.writeObject(manu);
			
			out.close();
			file.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
