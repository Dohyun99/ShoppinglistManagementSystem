package list;

import java.util.Scanner;

public class AllList extends List implements Listinput{

	public AllList(Listkind kind) {//»ý¼ºÀÚ
		super(kind);
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
}
