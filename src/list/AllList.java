package list;

import java.util.Scanner;

public class AllList extends List{

	public AllList(Listkind kind) {//»ý¼ºÀÚ univercity
		super(kind);
	}
	
	public void getUserinput(Scanner in) {
		listname(in);
		price(in);
		price2(in);
		locate(in);
	}
	
	public void printin() {
		String nkind = getKindString();
		System.out.println("kind of list: "+ nkind+", list: "+ this.list+", market price: "+ this.price+", internet price: "+this.price2+", locate: "+this.locate+"\n");
	}
}
