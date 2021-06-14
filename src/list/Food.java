package list;

import java.util.Scanner;

public class Food extends List{
	
	public Food(Listkind kind) {
		super(kind);
	}

	
	public void getUserinput(Scanner in) {//변경,정리, 간단하게
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
