import java.util.Scanner;

public class Main {
	
	public void writeTask(Queue q, int count)
	{
		for (int i=0; i<count; i++)
		{
			Scanner on = new Scanner(System.in);
		System.out.println("������� �����:");
		int num= on.nextInt();
		System.out.println("������� ���������:");
		int prior = on.nextInt();
		System.out.println("������� ������������:");
		int point = on.nextInt();
		System.out.println("������� ��������:");
		String des = on.nextLine();
		Task task = new Task();
		task.setTask(num, prior, point, des);
		q.insert(task);
		
		}
	}
	
public static void main(String args[]) {
		
		Main m=new Main();
		Scanner in = new Scanner(System.in);
		System.out.println("������� ���������� �����:");
		int count= in.nextInt();
		Queue q = new Queue(count);
		m.writeTask(q, count);
		q.showQueue(q);
		System.out.println("������������ ���������: "+q.maxPriority(q).getPriority());
		System.out.println("����� ������������: "+q.sumTasks(q));
		q.removeMax(q);
		System.out.println("������������ ��������� ����� �������� ������ � �������. �����������: "+ q.maxPriority(q).getPriority());
		q.clear(q);
		
	}
	

}
