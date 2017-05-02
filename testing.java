public class testing{		
		public static void main(String[ ] args) {
			StringBuffer name = 	new StringBuffer("Sam");
			boolean ok  	  = 	false;
			update(name, ok);
			System.out.println(name + ", "  + ok);
		}

		public static void update(StringBuffer name, boolean ok) {
			name.append(" Sultan");
			ok = true;
		}
}