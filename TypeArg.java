
public class TypeArg {
	public static void main(String args[]) {
		byte b1 = -128, b2 = 127;
		short s1 = -32768, s2 = 32767;
		int i1 = -2147483648, i2 = 2147483647;
		String type;
		for (int i=0; i<args.length; i++)
		{
			if ((b1 <= Integer.parseInt(args[i]))&&(Integer.parseInt(args[i]) <=b2))
				type = "byte";
			else if ((s1 <= Integer.parseInt(args[i]))&&(Integer.parseInt(args[i]) <=s2))
				type = "short";
			else if ((i1 <= Integer.parseInt(args[i]))&&(Integer.parseInt(args[i]) <=i2))
				type = "int";
			else type = "long";
			System.out.println(args[i] + " - " + type);
		}

	}

}
