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
	
	public void createLine() //���������� ����� � �����
	{
		Point point = new Point();
		point.createPoint();
		getArr().add(point);
	}
	
	public void createZeroLine() //���������� ����� � �����
	{
		Point point = new Point(0,0);
		point.createPoint();
		getArr().add(point);
	}
	
	
	
	public Point getPoint(int i) //���������� �� �������
	{
		return getArr().get(i);
	}
	
	public int findVertex(Point point)//���� ������� � ������ �� ������������
	{
		int index = getArr().indexOf(point);
		return index;
	}
	
	public String showLine(Line line)//����� ������
	{
		String poligon = "";
		for (Point p: line.getArr())
		{
			poligon+=p.showPoint(p)+"-";
		}
		
		return poligon;
	}
	
	public double calcLong(Line line)//������� �����
	{
		double sum=0;
		for (Point p: line.getArr())
		{
			sum+=p.findDistance(p);
		}
		
		return sum;
	}
	
	

}
