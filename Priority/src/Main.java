import java.util.Scanner;

public class Main {
	
	public void writeTask(Queue q, int count)
	{
		for (int i=0; i<count; i++)
		{
			Scanner on = new Scanner(System.in);
		System.out.println("Введите номер:");
		int num= on.nextInt();
		System.out.println("Введите приоритет:");
		int prior = on.nextInt();
		System.out.println("Введите трудоемкость:");
		int point = on.nextInt();
		System.out.println("Введите описание:");
		String des = on.nextLine();
		Task task = new Task();
		task.setTask(num, prior, point, des);
		q.insert(task);
		
		}
	}
	
public static void main(String args[]) {
		
		Main m=new Main();
		Scanner in = new Scanner(System.in);
		System.out.println("Введите количество задач:");
		int count= in.nextInt();
		Queue q = new Queue(count);
		m.writeTask(q, count);
		q.showQueue(q);
		System.out.println("Максимальный приоритет: "+q.maxPriority(q).getPriority());
		System.out.println("Сумма трудоемкости: "+q.sumTasks(q));
		q.removeMax(q);
		System.out.println("Максимальный приоритет после удаления задачи с наивысш. приоритетом: "+ q.maxPriority(q).getPriority());
		q.clear(q);
		
	}
	

}
