package Manumanager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import list.AllList;
import list.List;
import list.Listinput;
import list.Listkind;
import list.Stuff;

public class Manu implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6868741288587409330L;
	ArrayList<Listinput> lists = new ArrayList<Listinput>(); //배열로 만들어줌
	transient Scanner in;// transient : 저장하고 싶지 않다는 뜻.
	Manu(Scanner in){
		this.in =in;
	}
	
	public void add(String list, String name, String p1, String p2, String lo) {
		
		Listinput listn = new AllList(Listkind.food);
		listn.getUserinput(in);
		lists.add(listn); //목록에 list항목을 추가
	}
	
	public void add(Listinput listn) {
		lists.add(listn); 
	}
	
	public void add() {
		Listinput listn;
		int kind=0;
		while (kind!=1 && kind!=2) {
			try {// try catch문 추가
				System.out.println("select kind of list");
				System.out.println("1.food or 2.stuff");
				kind = in.nextInt();
				System.out.println("add list");
				if(kind == 1) {
					listn = new AllList(Listkind.food);
					listn.getUserinput(in);
					lists.add(listn); //목록에 list항목을 추가
					break; 
				}
				else if(kind==2) {
					listn = new Stuff(Listkind.stuff);
					listn.getUserinput(in);
					lists.add(listn); //목록에 list항목을 추가
					break;
				}
				else {
					System.out.println("select kind of list again 1 or 2");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("숫자를 입력해 주세요.");
				if(in.hasNext()) {//만약 next를 가지고 있으면 한번 더 처리한다.
					in.next();
				}
			}
		}
	}
	public void view() {
		if(lists.size()==0) { //list에 정보가 없다는 뜻인 null을 배열의 크기가 0일 때로 바꿈
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

		System.out.println("write list name that edit list");
		String shlist = in.next();
		for (int i=0; i<lists.size(); i++) {
			Listinput listm = lists.get(i);	
			if(listm.getList().equals(shlist)) {
				int n=0;
				while (n<5) {
					showeditmanu();//추가 0516
					n = in.nextInt();
					switch(n) { //if문을 switch 문으로 바꿈 - 짧게하고 보기 편해라고
					    case 1:
					    	listm.listname(in);//추가 0516
					    	break;
						case 2:
							listm.price(in);//추가 0516
							break;
						case 3:
							listm.price2(in);//추가 0516
							break;
						case 4:
							listm.locate(in);//추가 0516
							break;
						default:
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
		if(lists==null) {
			System.out.println("no information.");
			return;
		}
		else if(al.equals("y")||al.equals("Y")) {//짧게 수정
			System.out.println("write list name");
			String listname = in.next();
			int index = findindex(listname);
			remove(index, listname);
		}
	}
	
	public int findindex(String listname) { //0516추가
		int index = -1; //array에서 index를 못찾음
		for (int i=0; i<lists.size(); i++) {// list의 사이즈를 다 순회 할 때 까지 반복
			if(lists.get(i).getList().equals(listname)) {
				index = i; // list에서 i를 찾았을 때 i를 리턴, 즉 for문에서 i를 찾음
				break; 
			}
		}
		return index;
	}
	
	public int remove(int index, String listname) { //0516추가
		if(index >=0) {
			lists.remove(index);
			System.out.println(listname +" is deleted"); //index에 해당하는거 삭제
		}
		else {
			System.out.println("not found");
			return -1;
		}
		return index;
	}
	
	public int size() {
		return lists.size();
	}
	
	public Listinput get(int index) {
		return (List) lists.get(index);
	}
	
	public void showeditmanu() {//추가 0516
					System.out.println("1. edit list name");
					System.out.println("2. edit market price");
					System.out.println("3. edit internet price");
					System.out.println("4. edit locate");
					System.out.println("5. Exit");
	}

	public void setScanner(Scanner in2) {
		this.in=in2;
		
	}
}