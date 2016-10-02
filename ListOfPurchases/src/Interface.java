import java.util.Scanner;

public class Interface {
	
	public void writePurch(List list)
	{
		try{
		Scanner in = new Scanner(System.in);
		System.out.println("������� ����: ");
		String delo = in.nextLine();
		System.out.println("������� ���������: ");
		boolean bool = in.nextBoolean();
		list.createList(delo, bool);
		}
		catch (Throwable t)
		{
			System.out.println("������� ���������");
		}
	}
	
	public void showList(List list)
	{
		
			for (Purchase p: list.getList())
			{
				int index = list.getList().indexOf(p);
				System.out.println(index + "--" + p.getPur()+ "--"+ p.getDone());
			}
	}
	
	public void removing(List list)
	{
	    Scanner in = new Scanner(System.in);
		System.out.println("������� ����� ����: ");
		int number = in.nextInt();
		list.removePurch(number);
		
	}
	
	public void clearing(List list)
	{
		list.clearList();
	}
	
	public void changeState(List list)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("������� ����� ����: ");
		int number = in.nextInt();
		System.out.println("������� ���������: ");
		boolean state = in.nextBoolean();
		list.change(list, number).setBool(state);
		
		
	}
	
	public static void main (String[] args)
	{
		Interface inter= new Interface();
		List list = new List();
		
		Scanner in = new Scanner(System.in);
		
		while (true)
		{
		System.out.println("1.�������� ����");
		System.out.println("2.����������� ������ ��� � �������");
		System.out.println("3.������� ����");
		System.out.println("4.������� ���� ������");
		System.out.println("5.�������� ���������");
		System.out.println("6.�����");
		
				int choose = in.nextInt();
				switch(choose)
				{
				case 1: inter.writePurch(list);
					break;
				case 2: inter.showList(list);
					break;
				case 3: inter.removing(list);
					break;
				case 4: inter.clearing(list);
					break;
				case 5: inter.changeState(list);
					break;
				case 6: System.exit(0); 
					break;
				}
		}
		
	}

}
