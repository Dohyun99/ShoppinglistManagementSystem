package list;

import java.util.Scanner;

import Exceptions.Price2Exception;

public interface Listinput {
	
	public String getList();
	
	public void printin();
	
	public void setList(String list);
	
	public void setPrice(String price);
	
	public void setPrice2(String price2) throws Price2Exception;
	
	public void setLocate(String locate);
	
	public void getUserinput(Scanner in);
		
	public void listname(Scanner in);
	
	public void price(Scanner in); //추가 0516

	public void price2(Scanner in); //추가 0516

	public void locate(Scanner in);
}
