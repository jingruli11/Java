import java.util.*;
import java.lang.Math;

public class c2f {
	public static void main(String []args) {
		System.out.println("Please enter the degree in Celsius: ");
		Scanner sc = new Scanner (System.in);
		String cel = sc.next();
		float c = Float.parseFloat(cel);

		float f = Math.round(((c * 9 / 5) + 32) * 100);
		f = f / 100;
		System.out.println(c + "\t degree in Celsius is \t" + f + "\t degree in Fahrenheit. ");
		
	}
}
