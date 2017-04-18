
import java.lang.Math;
import java.util.*;
public class testrand{
	public static void main(String[] arg){
		System.out.println("Please enter the lower bound: ");
		Scanner sc = new Scanner (System.in);
		int low = sc.nextInt();

		System.out.println("Please enter the higher bound: ");
		Scanner sc2 = new Scanner (System.in);
		int high = sc2.nextInt();
		int num = genRand(low, high);
		System.out.println(num);
	}	

	static int genRand(int min, int max) 
	{
			int rand;
			rand = (int) (Math.random( )*(max-min+1));
			rand = rand + min;
			return(rand);

	}
	
}