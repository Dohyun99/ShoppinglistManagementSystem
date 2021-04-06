
public class List {

	String list;
	int price;
	int price2;
	String locate;
	
	public List() {
		
	}
	
	public List(String list, int price, int price2, String locate){
		this.list=list;
		this.price=price;
		this.price2=price2;
		this.locate=locate;
	}
	public void printin() {
		System.out.println("list: "+ this.list+", market price: "+ this.price+", internet price: "+this.price2+", locate: "+this.locate+"\n");
	}
}
