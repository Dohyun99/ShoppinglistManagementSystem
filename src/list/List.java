package list;

import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

import Exceptions.Price2Exception;

public abstract class List implements Listinput, Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = 1517676907665466967L;
	//List��� ��ü�� �������� �ʴ´�.
	protected Listkind kind= Listkind.food;
	protected String list;
	protected String price;// int ->String
	protected String price2;// int ->String
	protected String locate;
	
	public List() {
		
	}
	public List(Listkind kind) {
		this.kind = kind;
	}
	
	
	public List(String list, String price, String price2, String locate){
		this.list=list;
		this.price=price;
		this.price2=price2;
		this.locate=locate;
	}
	public Listkind getKind() {
		return kind;
	}

	public void setKind(Listkind kind) {
		this.kind = kind;
	}

	public String getList() {
		return list;
	}

	public void setList(String list) {
		this.list = list;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPrice2() {
		return price2;
	}

	public void setPrice2(String price2) throws Price2Exception {//�߰�0516
		if(!price2.contains("��")&&!price2.equals("")) {
			throw new  Price2Exception();
		}
		this.price2 = price2;
	}

	public String getLocate() {
		return locate;
	}

	public void setLocate(String locate) {
		this.locate = locate;
	}
	public abstract void printin();
	
	public void listname(Scanner in) {//�߰� 0516 Listinput listm�� ���� ������ Listinput�� implements�ϱ� ������ this�� ó�� �����ϱ� ����
		System.out.println("list name");
		String Listname = in.next();
		this.setList(Listname);
	}
	public void price(Scanner in) {//�߰� 0516
		System.out.println("market price");
		String price=in.next();
		this.setPrice(price);
	}
	public void price2(Scanner in) {//�߰� 0516
		String price2 = "";
		while(!price2.contains("��")) {
			System.out.println("internet price ex) 1000��");
			price2=in.next();
			try {
				this.setPrice2(price2);
			} 
			catch (Price2Exception e) {
				System.out.println("incorrect internet price formet. put the internet price contains '��' ����");
			}
		}
	}
	public void locate(Scanner in) {//�߰� 0516
		System.out.println("where you found");
		String locate=in.next();
		this.setLocate(locate);
	}
	public String getKindString() { //0516����
		String nkind = "none"; //0516 �ű�
		switch(this.kind) {
		case food:
			nkind = "food";
			break;
		case stuff:
			nkind = "stuff";
			break;
		default:
		}
		return nkind;
	}
	
}
