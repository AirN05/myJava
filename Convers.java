
public class Convers {
	public static void main(String args[]) {
		int sys = Integer.parseInt(args[2]);
		int first = Integer.parseInt(args[0], Integer.parseInt(args[1]));
		String second = Integer.toString(first, sys);
		
		System.out.println(args[0] + "("+args[1]+")");
		System.out.println(first + "(10)");
		System.out.println(second + "(" + sys +")");
		
	}

}
