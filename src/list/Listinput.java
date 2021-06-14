package list;

import java.util.Scanner;

import Exceptions.Price2Exception;

public interface Listinput {
	
	public void printin();
	
	public String getList();
	
	public Listkind getKind();
	
	public String getPrice();
	
	public String getPrice2();
	
	public String getLocate();
	
	public void setList(String list);
	
	public void setPrice(String price) throws Price2Exception;
	
	public void setPrice2(String price2) throws Price2Exception;
	
	public void setLocate(String locate);
	
	public void getUserinput(Scanner in);
		
	public void listname(Scanner in);
	
	public void price(Scanner in); //추가 0516

	public void price2(Scanner in); //추가 0516

	public void locate(Scanner in);
}
