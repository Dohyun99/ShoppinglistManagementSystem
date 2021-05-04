package list;

import java.util.Scanner;

public class Stuff extends List {
	
	public Stuff(Listkind kind) {
		super(kind);
	}
	
	public void getUserinput(Scanner in) {
		System.out.println("add stuff list");
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
