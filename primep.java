import java.util.*;
import java.lang.Math;
public class primep{
	public static void main(String []args){

		System.out.println("Enter a number");
		Scanner sc = new Scanner (System.in);
		int i = sc.nextInt();
		int r = 1;

		for (int j = 2; j < Math.round(Math.sqrt(i))+1; j++){
			r = i % j;

			if (r == 0){
				break;
			} 

		}

		if (r == 0){
			System.out.println("The number is not prime. ");
		} else {
			System.out.println("The number is prime. ");
		}
	}	
}