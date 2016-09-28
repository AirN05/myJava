import java.util.ArrayList;

public class Line {
	
	private ArrayList <Point> arr = new ArrayList<Point>();
	
	Line()
	{
		
	}
	
	public ArrayList <Point> getArr()
	{
		return arr;
	}
	
	public void createLine() //добавление точки в конец
	{
		Point point = new Point();
		point.createPoint();
		getArr().add(point);
	}
	
	public void createZeroLine() //добавление точки в конец
	{
		Point point = new Point(0,0);
		point.createPoint();
		getArr().add(point);
	}
	
	
	
	public Point getPoint(int i) //извлечение по индексу
	{
		return getArr().get(i);
	}
	
	public int findVertex(Point point)//ищем вершину с такими же координатами
	{
		int index = getArr().indexOf(point);
		return index;
	}
	
	public String showLine(Line line)//вывод строки
	{
		String poligon = "";
		for (Point p: line.getArr())
		{
			poligon+=p.showPoint(p)+"-";
		}
		
		return poligon;
	}
	
	public double calcLong(Line line)//считаем длину
	{
		double sum=0;
		for (Point p: line.getArr())
		{
			sum+=p.findDistance(p);
		}
		
		return sum;
	}
	
	

}
