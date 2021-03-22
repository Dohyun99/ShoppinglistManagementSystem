import java.util.Scanner;

public class ManuManager {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n=0;
		while (n!=5) {
			System.out.println("1. Add shopping list");
			System.out.println("2. View shopping list");
			System.out.println("3. Edit shopping list");
			System.out.println("4. Delete all");
			System.out.println("5. Exit");
			System.out.println("select menu");
			n = in.nextInt();
			
			switch(n){
			case 1:
				System.out.println("add Shopping list");
				String list = in.next();
				
				System.out.println("add products market price");
				int marketprice=in.nextInt();
				
				System.out.println("add products internet price");
				int internetprice=in.nextInt();
				
				System.out.println("add lowest prices where you found(ex) naver, 11ts, LotteMart)");
				String lowprice=in.next();
				break;
			case 2:
				System.out.println("viewing all list\n");
				break;
			case 3:
				System.out.println("select list what you want edit\n");
				break;
			case 4:
				System.out.println("are you sure delete all list? press 'y' or 'n'\n");
				break;
			}
		}
	}
	
}