
public class Task {
	
	private int number;
	private int priority;
	private int points;
	private String description;

	
	public int getNumber()
	{
		return number;
	}
	
	public int getPriority()
	{
		return priority;
	}
	
	public int getPoints()
	{
		return points;
	}
	
	public void setPrior(int pr)
	{
		this.priority=pr;
	}
	
	public void setTask(int number, int priority, int points, String description)
	{
		this.number=number;
		this.priority=priority;
		this.points=points;
		this.description=description;
	}
}
