package list;

import java.util.Scanner;

public abstract class List {//List라는 객체를 생성하지 않는다.
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
	public abstract void printin();
		
	
}
