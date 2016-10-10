import java.util.Scanner;

public class Interface {
	
	
	
	public Line choice(Line line)
	{	
		Scanner in = new Scanner(System.in);
		System.out.println("Введите кол-во точек: ");
		int count = in.nextInt();
		System.out.println("Хотите ввести начальную точку?\n1.Да\n2.Нет");
		int ch = in.nextInt();
		if (ch==1) 
			{
				for (int i=0; i<count; i++)
				{
					
					line.addPoint();}
				}
		else
			{
				for (int i=0; i<count; i++)
				{
					
					line.createZeroLine();
	
				}
			}
		return line;
		
	}
	
	public void showPoligon(Line line)
	{
	
		
		System.out.println(line.showLine());
	}
	
	
	public void showDistanse(Line line)
	{
		System.out.println(line.calcLong(line));
	}
	
	
	public void find(Line line)
	{
		System.out.println(line.findPoint());
	}
	
	public static void main(String args[]) {
	
		
	Interface inter= new Interface();
	Line line = new Line();
	Scanner in = new Scanner(System.in);
	line = inter.choice(line);
	for(;;)
	{
		System.out.println("1.Добавить точку\n2.Вывод информации о линии\n3.Вывод суммарной длины\n4.Найти совпадающую точку\n5.Выход");
		int choose = in.nextInt();
		switch(choose)
		{
		case 1: line.addPoint();
			break;
		case 2: inter.showPoligon(line);
			break;
		case 3: inter.showDistanse(line);
			break;
		case 4: inter.find(line);
			break;
		case 5: System.exit(0); 
			break;
		}
	}
	
	
	}

}
