public class testing71{


	public static void main(String[] args) {
		/*if (args.length < 4) {
			System.out.println("Re-execute with at least 4 arguments");
			System.exit(-1);
		}*/
		String color1 = args[0];
		String color2 = args[1];
		int num1 = Integer.parseInt(args[2]);
		double n2 = Double.parseDouble(args[3]);

		for (int i = 0; i < args.length; i++) {
			System.out.println(i + " argument is " + args[i]);
		}

	}
}