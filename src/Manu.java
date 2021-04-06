import java.util.Scanner;

public class Manu {
	List list; 
	Scanner in;
	Manu(Scanner in){
		this.in =in;
	}
	
	public void add() {
		list = new List();
		System.out.println("add Shopping list");
		list.list = in.next();
		
		System.out.println("add products  market price");
		list.price=in.nextInt();
		
		System.out.println("add products internet price");
		list.price2=in.nextInt();
		
		System.out.println("add where you found lowest prices(ex) naver, 11ts, LotteMart)");
		list.locate=in.next();
	}
	public void view() {
		if(list==null) {
			System.out.println("no information.");
			return;
		}
		else {
		System.out.println("viewing all list\n");
		list.printin();
		}
	}
	public void edit() {
		System.out.println("select list what you want edit");

		System.out.println("Shopping list");
		String list = in.next();
		
		System.out.println("edit list name");
		String list2 = in.next();
		
		System.out.println("edit market price");
		int marketprice=in.nextInt();
		
		System.out.println("edit internet price");
		int internetprice=in.nextInt();
		
		System.out.println("edit where you found)");
		String lowprice=in.next();
	}
	public void delete() {
		if(list==null) {
			System.out.println("no information.");
			return;
		}
		else {
			System.out.println("are you sure delete all list? press 'y' or 'n'\n");
			String yn = in.next();
			if(yn.equals("y")) {
				list=null;
				System.out.println("all lists are deleted.");
			}
			else if(yn.equals("n")){
					return;
			}
		}
	}
}
