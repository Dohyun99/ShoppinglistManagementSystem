package Manumanager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import list.AllList;
import list.List;
import list.Listinput;
import list.Listkind;
import list.Stuff;

public class Manu implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6868741288587409330L;
	ArrayList<Listinput> lists = new ArrayList<Listinput>(); //�迭�� �������
	transient Scanner in;// transient : �����ϰ� ���� �ʴٴ� ��.
	Manu(Scanner in){
		this.in =in;
	}
	
	public void add(String list, String name, String p1, String p2, String lo) {
		
		Listinput listn = new AllList(Listkind.food);
		listn.getUserinput(in);
		lists.add(listn); //��Ͽ� list�׸��� �߰�
	}
	
	public void add(Listinput listn) {
		lists.add(listn); 
	}
	
	public void add() {
		Listinput listn;
		int kind=0;
		while (kind!=1 && kind!=2) {
			try {// try catch�� �߰�
				System.out.println("select kind of list");
				System.out.println("1.food or 2.stuff");
				kind = in.nextInt();
				System.out.println("add list");
				if(kind == 1) {
					listn = new AllList(Listkind.food);
					listn.getUserinput(in);
					lists.add(listn); //��Ͽ� list�׸��� �߰�
					break; 
				}
				else if(kind==2) {
					listn = new Stuff(Listkind.stuff);
					listn.getUserinput(in);
					lists.add(listn); //��Ͽ� list�׸��� �߰�
					break;
				}
				else {
					System.out.println("select kind of list again 1 or 2");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("���ڸ� �Է��� �ּ���.");
				if(in.hasNext()) {//���� next�� ������ ������ �ѹ� �� ó���Ѵ�.
					in.next();
				}
			}
		}
	}
	public void view() {
		if(lists.size()==0) { //list�� ������ ���ٴ� ���� null�� �迭�� ũ�Ⱑ 0�� ���� �ٲ�
			System.out.println("no information.");
			return;
		}
		else {
			System.out.println("viewing all list\n");
			System.out.println("size"+ lists.size());
			for(int i=0; i<lists.size(); i++) {
					lists.get(i).printin(); //i�� �ش��ϴ� ��ü�� ������ ���
			}
		}
	}
	public void edit() {
		System.out.println("select list what you want edit");

		System.out.println("write list name that edit list");
		String shlist = in.next();
		for (int i=0; i<lists.size(); i++) {
			Listinput listm = lists.get(i);	
			if(listm.getList().equals(shlist)) {
				int n=0;
				while (n<5) {
					showeditmanu();//�߰� 0516
					n = in.nextInt();
					switch(n) { //if���� switch ������ �ٲ� - ª���ϰ� ���� ���ض��
					    case 1:
					    	listm.listname(in);//�߰� 0516
					    	break;
						case 2:
							listm.price(in);//�߰� 0516
							break;
						case 3:
							listm.price2(in);//�߰� 0516
							break;
						case 4:
							listm.locate(in);//�߰� 0516
							break;
						default:
							continue;
					}
				}
				break;
			}
		}
	}
	public void delete() {
		System.out.println("delete list y/n");
		
		String al = in.next();
		if(lists==null) {
			System.out.println("no information.");
			return;
		}
		else if(al.equals("y")||al.equals("Y")) {//ª�� ����
			System.out.println("write list name");
			String listname = in.next();
			int index = findindex(listname);
			remove(index, listname);
		}
	}
	
	public int findindex(String listname) { //0516�߰�
		int index = -1; //array���� index�� ��ã��
		for (int i=0; i<lists.size(); i++) {// list�� ����� �� ��ȸ �� �� ���� �ݺ�
			if(lists.get(i).getList().equals(listname)) {
				index = i; // list���� i�� ã���� �� i�� ����, �� for������ i�� ã��
				break; 
			}
		}
		return index;
	}
	
	public int remove(int index, String listname) { //0516�߰�
		if(index >=0) {
			lists.remove(index);
			System.out.println(listname +" is deleted"); //index�� �ش��ϴ°� ����
		}
		else {
			System.out.println("not found");
			return -1;
		}
		return index;
	}
	
	public int size() {
		return lists.size();
	}
	
	public Listinput get(int index) {
		return (List) lists.get(index);
	}
	
	public void showeditmanu() {//�߰� 0516
					System.out.println("1. edit list name");
					System.out.println("2. edit market price");
					System.out.println("3. edit internet price");
					System.out.println("4. edit locate");
					System.out.println("5. Exit");
	}

	public void setScanner(Scanner in2) {
		this.in=in2;
		
	}
}