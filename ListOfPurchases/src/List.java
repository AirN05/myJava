import java.util.ArrayList;

public class List {
	
	private ArrayList <Purchase> list = new ArrayList<Purchase>();
	
	public ArrayList <Purchase> getList()
	{
		return list;
	}
	
	public void createList(String thing, boolean did) 
		{
			Purchase pur = new Purchase();
			pur.setPurch(thing);
			pur.setBool(did);
			getList().add(pur);
		}
	public void removePurch(int index)
	{
		getList().remove(index);
	}

	public void clearList()
	{
		getList().clear();
	}
	
	public Purchase change(List list, int number)
	{
		return list.getList().get(number);
	}
}
