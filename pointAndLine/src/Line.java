import java.util.ArrayList;

public class Line {
	
	private ArrayList <Point> arr = new ArrayList<Point>();
	
	Line()
	{
		
	}
	
	
	public void addPoint() //добавление точки в конец
	{
		Point point = new Point();
		point.createPoint();
		arr.add(point);
	}
	
	public void createZeroLine() //добавление точки в конец
	{
		Point point = new Point(0,0);
		point.createPoint();
		arr.add(point);
	}
	
	
	
	public Point getPoint(int i) //извлечение по индексу
	{
		return arr.get(i);
	}
	
	public int findVertex(Point point)//ищем вершину с такими же координатами
	{
		int index = arr.indexOf(point);
		return index;
	}
	
	public String showLine()//вывод строки
	{
		String poligon = "";
		for (Point p: arr)
		{
			poligon+=p.toString()+"-";
		}
		
		return poligon;
	}
	
	public double calcLong(Line line)//считаем длину
	{
		
		double sum=0;
		
		for(int i=0; i<arr.size()-1; i++)
		{
			sum+=getPoint(i).findDistance(getPoint(i+1));

		}
		
		return sum;
	}
	
	public void findPoint()
	{
		Point p=new Point();
		p.createPoint();
		int s = 0;
		for (Point po: arr)
			{
			
			if (po.equals(p)==true)
				{
					s = findVertex(po);
					System.out.println("Найденная вершина - "+s);
				}
				
			}
		
	}

}
