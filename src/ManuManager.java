
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManuManager {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Manu manu = new Manu(in);
		selectmanu(in, manu);//추가0516
	}
	
	public static void selectmanu(Scanner in, Manu manu) {//추가0516
		int n=0;
		while (n<5) {
			try {
				showmanu();
				n = in.nextInt(); //추가 0516
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
				default://추가 0516
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("숫자를 입력해 주세요.");
				if(in.hasNext()) {//만약 next를 가지고 있으면 한번 더 처리한다.
					in.next();
				}
				n=0;
				System.out.println(n);
			}
		}				
	}
	
	public static void showmanu() {
		System.out.println("1. Add shopping list");
		System.out.println("2. View shopping list");
		System.out.println("3. Edit shopping list");
		System.out.println("4. Delete list");
		System.out.println("5. Exit");
	}
}