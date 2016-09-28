import java.util.Scanner;
public class Point {
	
	private double x;
	private double y;
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public void setXY(double x, double y)
	{
		this.x=x;
		this.y=y;
	}
		
	Point()
	{
	}
	
	Point(double x, double y)
	{
		this.x=x;
		this.y=y;
	}
	
	public void createPoint()
	{
		Scanner in = new Scanner(System.in);
		Point p = new Point();
		System.out.println("¬ведите координату х: ");
		double a = in.nextInt();
		System.out.println("¬ведите координату y: ");
		double b = in.nextInt();
		setXY(a, b);
	
	}
	
	public String showPoint(Point point)
	{
		return "("+point.getX()+";"+point.getY()+")";
		
	}
	
	public void movePoint(Point point)
	{
		this.x = point.getX();
		this.y = point.getY();
	}
	
	public boolean isSame(Point point) 
	{
        if(this.x == point.getX() && this.y == point.getY()) 
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }
	
	public double findDistance(Point point) 
	{
        return Math.sqrt(Math.pow(this.x-point.getX(), 2) + Math.pow(this.y-point.getY(), 2));
    }
	
	public double findRadius() 
	{
        Point point = new Point();
        return findDistance(point);
    }
	
	public static void main(String args[]) {
		
	}
	

}
