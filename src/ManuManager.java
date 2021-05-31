
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import EventLog.EventLog;

public class ManuManager {
	
	static EventLog logger=new EventLog("list.txt");// txt���� �߰� 0524
	
	public static void main(String[] args){
		//����ȭ: serialization
		Scanner in = new Scanner(System.in);
		Manu manu = getObject("manu.ser");//��������
		if(manu==null) {//
			manu = new Manu(in);//
		}
		
		selectmanu(in, manu);//�߰�0524
		putObject(manu, "manu.ser");//seriallization �߰�
	}
	
	public static void selectmanu(Scanner in, Manu manu) {//�߰�0516
		int n=0;
		while (n<5) { 
			try {
				showmanu();
				n = in.nextInt(); //�߰� 0516
				switch(n){
				case 1:
					manu.add();
					logger.log("1. Add shopping list");
					break;
				case 2:
					manu.view();
					logger.log("2. View shopping list");
					break;
				case 3:
					manu.edit();
					logger.log("3. Edit shopping list");
					break;
				case 4:
					manu.delete();
					logger.log("4. Delete list");
					break;
				default://�߰� 0516
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("���ڸ� �Է��� �ּ���.");
				if(in.hasNext()) {//���� next�� ������ ������ �ѹ� �� ó���Ѵ�.
					in.next();
				}
				n=0;
				System.out.println(n);
			}
		}
	}

	public static void showmanu() {
		System.out.println("1. Add shopping list");
		System.out.println("2. View shopping list");
		System.out.println("3. Edit shopping list");
		System.out.println("4. Delete list");
		System.out.println("5. Exit");
	}
	public static Manu getObject(String fileName) {
		Manu manu=null;
		try {
			FileInputStream	file = new FileInputStream(fileName);
			ObjectInputStream in=new ObjectInputStream(file);
			
			manu = (Manu) in.readObject();//(Manu)�� Manu Ÿ������ ������ȯ ���ִ°�
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