package calc;

public class Calculator {
	public static void main(String args[]) {
		int ans = 0;
		switch (args[1])
		{
		case "+": 
			ans = Integer.parseInt(args[0])+Integer.parseInt(args[2]);
			break;
		case "-": 
			ans = Integer.parseInt(args[0])-Integer.parseInt(args[2]);
			break;
		case "*": 
			ans = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
			break;
		case "/": 
			ans = Integer.parseInt(args[0])/Integer.parseInt(args[2]);
			break;
			
		}
		System.out.println(ans);
	}

}
