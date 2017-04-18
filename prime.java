import java.util.*;
import java.lang.Math;
public class prime{
	public static void main(String []args){

		System.out.println("Enter a number");
		Scanner sc = new Scanner (System.in);
		int i = sc.nextInt();
		int r = 1;

		if ( i > 0 ) {
			int m = 2;

			for (int j = m ; j < Math.round(Math.sqrt(i)); j++){
					r = i % j;

					if (r == 0) {
						break;
					}
			}
		} else {
			int m = -2;

			for (int j = m ; j > Math.round(Math.sqrt(i)); j--){
				
					r = i % j;

					if (r == 0) {
						break;
				} 
			}

		}

		if ( r == 0){
			System.out.println("The number is not prime. ");
		} else {
			System.out.println("The number is prime. ");
		}
	}
}