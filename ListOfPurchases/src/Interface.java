import java.util.Scanner;

public class Interface {
	
	public void writePurch(List list)
	{
		try{
		Scanner in = new Scanner(System.in);
		System.out.println("Введите дело: ");
		String delo = in.nextLine();
		System.out.println("Введите состояние: ");
		boolean bool = in.nextBoolean();
		list.createList(delo, bool);
		}
		catch (Throwable t)
		{
			System.out.println("Введите корректно");
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
		System.out.println("Введите номер дела: ");
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
		System.out.println("Введите номер дела: ");
		int number = in.nextInt();
		System.out.println("Введите состояние: ");
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
		System.out.println("1.Добавить дело");
		System.out.println("2.Просмотреть список дел и покупок");
		System.out.println("3.Удалить дело");
		System.out.println("4.Удалить весь список");
		System.out.println("5.Изменить состояние");
		System.out.println("6.Выход");
		
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
