import java.util.*;

public class fun1 {
	public static void main(String[] args){

		Scanner sc = new Scanner (System.in);
		
		int i = sc.nextInt();
		int j = i%10000;
		System.out.println(j/1000);
		System.out.println((j/100)%10);
		System.out.println((j/10)%10);
		System.out.println(j%10);
	}
}