import java.util.*;

public class logshift {
	public static void main (String []args) {
		System.out.println("Input x: ");
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		System.out.println("Count: ");
		Scanner sc2 = new Scanner (System.in);
		int b = sc2.nextInt();
		
		
			for (int i = 0; i < b; i++) {
				a >>>= 1; //Logical shift by 1
			}
			
		
		System.out.println(a);


	}
}