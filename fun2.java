import java.util.*;
public class fun2 {
	public static void main(String[] args){

		System.out.println("What is the product price in cents?");
		Scanner sc = new Scanner (System.in);
		int p = sc.nextInt();
		System.out.println("How much did you give me?");
		Scanner sc2 = new Scanner (System.in);
		int m = sc2.nextInt();

		int change = m - p;
		if (change < 0) {
			System.out.println("Not enough money");
		} else {
			int d = change/100;
		int q = (change%100)/25;
		int i = ((change%100) - q * 25) / 10;
		int n = ((change%100) - q * 25 - i * 10) / 5;
		int c = (change%100) - q * 25 - i * 10 - n * 5;

		System.out.println("The change is :");
		System.out.println(d + " dollars");
		System.out.println(q + " quaters");
		System.out.println(i + " dimes");
		System.out.println(n + " nickles");
		System.out.println(c + " cents");
		}
		
	}	
}

