
import java.util.ArrayList;
import java.util.Scanner;

import list.Food;
import list.List;
import list.Stuff;

public class Manu {
	ArrayList<List> lists = new ArrayList<List>(); //배열로 만들어줌
	Scanner in;
	Manu(Scanner in){
		this.in =in;
	}
	
	public void add() {
		int kind=0;
		List listn;
		while (kind!=1 && kind!=2) {
			System.out.println("select kind of list");
			System.out.println("1.food or 2.stuff");
			kind = in.nextInt();
			if(kind == 1) {
				listn = new Food();
				listn.getUserinput(in);
				lists.add(listn); //목록에 list항목을 추가
				break;
			}
			else if(kind==2) {
				listn = new Stuff();
				listn.getUserinput(in);
				lists.add(listn); //목록에 list항목을 추가
				break;
			}
			else {
				System.out.println("s elect kind of list again 1 or 2");
			}
		}
	}
	public void view() {
		if(lists==null) {
			System.out.println("no information.");
			return;
		}
		else {
			System.out.println("viewing all list\n");
			System.out.println("size"+ lists.size());
			for(int i=0; i<lists.size(); i++) {
					lists.get(i).printin(); //i에 해당하는 객체의 정보를 출력
			}
		}
	}
	public void edit() {
		System.out.println("select list what you want edit");

		System.out.println("write list name");
		String shlist = in.next();
		for (int i=0; i<lists.size(); i++) {
			List listm = lists.get(i);	
			if(listm.getList().equals(shlist)) {
				int n=0;
				while (n<5) {
					System.out.println("1. edit list name");
					System.out.println("2. edit market price");
					System.out.println("3. edit internet price");
					System.out.println("4. edit locate");
					System.out.println("5. Exit");
					n = in.nextInt();
					if(n==1) {
						System.out.println("edit list name");
						String Listname = in.next();
						listm.setList(Listname);
					}
					else if(n==2) {
						System.out.println("edit market price");
						int price=in.nextInt();
						listm.setPrice(price);
					}
					else if(n==3) {
						System.out.println("edit internet price");
						int price2=in.nextInt();
						listm.setPrice2(price2);
					}
					else if(n==4) {
						System.out.println("edit where you found)");
						String locate=in.next();
						listm.setLocate(locate);
					}
					else {
						continue;
					}
				}
				break;
			}
		}
	}
	public void delete() {
		System.out.println("delete list y/n");
		
		String al = in.next();
		int index = -1; //array에서 index를 못찾음
		
		if(lists==null) {
			System.out.println("no information.");
			return;
		}
		else if(al.equals(("y"))) {
			System.out.println("write list name");
			String listname = in.next();
			for (int i=0; i<lists.size(); i++) {// list의 사이즈를 다 순회 할 때 까지 반복
				if(lists.get(i).getList().equals(listname)) {
					index = i; // list에서 i를 찾았을 때 i를 리턴, 즉 for문에서 i를 찾음
					break; 
				}
			}
			if(index >=0) {
				lists.remove(index);
				System.out.println(listname +" is deleted"); //index에 해당하는거 삭제
			}
			else {
				System.out.println("not found");
				return;
			}
		}
	}
}