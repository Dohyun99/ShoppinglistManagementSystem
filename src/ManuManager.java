import java.util.Scanner;

public class ManuManager {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=0;
		while (n<6) {
			System.out.println("1. Add shopping list");
			System.out.println("2. View shopping list");
			System.out.println("3. Edit shopping list");
			System.out.println("4. Delete all");
			System.out.println("6. Exit");
			System.out.println("select menu(5을 누르면 메뉴를 새로고침합니다.");
			n = in.nextInt();
			
			switch(n){
			case 1:
				add();
				break;
			case 2:
				view();
				break;
			case 3:
				edit();
				break;
			case 4:
				delete();
				break;
			}
		}
	}
	public static void add() {
		Scanner in2 = new Scanner(System.in);
		System.out.println("add Shopping list");
		String list = in2.nextLine();
		
		System.out.println("add products  market price");
		int marketprice=in2.nextInt();
		
		System.out.println("add products internet price");
		int internetprice=in2.nextInt();
		
		System.out.println("add where you found lowest prices(ex) naver, 11ts, LotteMart)");
		String lowprice=in2.next();
	}
	public static void view() {
		System.out.println("viewing all list\n");
	}
	public static void edit() {
		System.out.println("select list what you want edit\n");

		Scanner in2 = new Scanner(System.in);
		System.out.println("Shopping list");
		String list = in2.nextLine();
		
		System.out.println("edit list name");
		String list = in2.nextLine();
		
		System.out.println("edit market price");
		int marketprice=in2.nextInt();
		
		System.out.println("edit internet price");
		int internetprice=in2.nextInt();
		
		System.out.println("edit where you found)");
		String lowprice=in2.next();
	}
	public static void delete() {
		System.out.println("are you sure delete all list? press 'y' or 'n'\n");
	}
}