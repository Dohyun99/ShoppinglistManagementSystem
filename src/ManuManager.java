import java.util.Scanner;

public class ManuManager {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Manu manu = new Manu(in);
		int n=0;
		while (n<5) {
			System.out.println("1. Add shopping list");
			System.out.println("2. View shopping list");
			System.out.println("3. Edit shopping list");
			System.out.println("4. Delete all");
			System.out.println("5. Exit");
			n = in.nextInt();
			
			switch(n){
			case 1:
				manu.add();
				break;
			case 2:
				manu.view();
				break;
			case 3:
				manu.edit();
				break;
			case 4:
				manu.delete();
				break;
			}
		}
	}
}