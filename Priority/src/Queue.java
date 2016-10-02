import java.util.Scanner;

public class Queue {

	public Task[] tasks;
	public int size;
	public int nItems;
	
	Queue()
	{
		this(20);
	}
	
	Queue(int size)
	{
		this.size=size;
		tasks = new Task[size];
		nItems=0;
		
	}
	
	public void insert(Task task)
	{
		int i;
		if(nItems==0)
			tasks[nItems++]=task;
		else
		{
			for(i=nItems-1; i>=0; i--)
			{
				if (task.getPriority() > tasks[i].getPriority())
				{
					tasks[i+1]=tasks[i];
				}
				else break;
					
			}
			tasks[i+1]=task;
			nItems++;
		}
	}
	
	
	public Task maxPriority(Queue q)
	{
		
		return q.tasks[nItems-1];
	}
	
	public Task removeMax(Queue q)
	{
		
		return q.tasks[--nItems];
	}
	
	public void removeNumber(Queue q, int num)
	{
		for(int i=0; i<tasks.length; i++)
		{
			if (q.tasks[i].getNumber()==num)
				tasks[i]=null;
		}
	}
	
	public Task getTask(Queue q, int num)
	{	
		Task t=null;
		for(int i=0; i<tasks.length; i++)
		{
			if (q.tasks[i].getNumber()==num)
				
			     t = tasks[i];
		}
		return t;
	}
	
	public void changePrior(Queue q, int num, int pr)
	{
		for(int i=0; i<tasks.length; i++)
		{
			if (q.tasks[i].getNumber()==num)
				
				q.tasks[i].setPrior(pr);
		}
		
	}
	
	public void clear(Queue q)
	{
		for(int i=0; i<tasks.length; i++)
		{
				q.tasks[i]=null;
		}
		nItems=0;
	}
	
	public void showQueue(Queue q)
	{
		for(int i=0; i<tasks.length; i++)
		{
				System.out.println(q.tasks[i].getNumber()+" "+q.tasks[i].getPriority()+" "+q.tasks[i].getPoints());
		}
	}
	
	public int sumTasks(Queue q)
	{
		int sum = 0;
		for(int i=0; i<tasks.length; i++)
		{
			sum+=q.tasks[i].getPoints();
		}
	
		return sum;
	}
	

	
	
	
	
	
	
	
}
