package list;

import java.util.Scanner;

public class List {
	protected Listkind kind= Listkind.food;
	protected String list;
	protected int price;
	protected int price2;
	protected String locate;
	
	public List() {
		
	}
	public List(Listkind kind) {
		this.kind = kind;
	}
	
	
	public List(String list, int price, int price2, String locate){
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice2() {
		return price2;
	}

	public void setPrice2(int price2) {
		this.price2 = price2;
	}

	public String getLocate() {
		return locate;
	}

	public void setLocate(String locate) {
		this.locate = locate;
	}
	public void printin() {
		String nkind = "none";
		switch(this.kind) {
		case food:
			nkind = "food";
			break;
		case stuff:
			nkind = "stuff";
			break;
		default:
		}
		System.out.println("kind of list: "+ nkind+", list: "+ this.list+", market price: "+ this.price+", internet price: "+this.price2+", locate: "+this.locate+"\n");
	}
	public void getUserinput(Scanner in) {
		System.out.println("add Shopping list");
		String list = in.next();
		this.setList(list);
		
		System.out.println("add products  market price");
		int price=in.nextInt();
		this.setPrice(price);
		
		System.out.println("add products internet price");
		int price2=in.nextInt(); 
		this.setPrice2(price2);
		
		System.out.println("add where you found lowest prices(ex) naver, 11ts, LotteMart)");
		String locate=in.next();
		this.setLocate(locate);
	}
}
