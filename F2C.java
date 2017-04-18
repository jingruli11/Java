import java.util.*;
import java.lang.Math;

public class F2C {
	public static void main(String []args) {
		System.out.println("Please enter the degree in Fahrenheit: ");
		Scanner sc = new Scanner (System.in);
		String fah = sc.next();
		float f = Float.parseFloat(fah);
		
		float c = Math.round(((f - 32) * 5 / 9) *100);
		c = c/100;

		System.out.println(f + "\t degrees in Fahrenheit is \t" + c + "\t degrees in Celsius. ");

	}
}
