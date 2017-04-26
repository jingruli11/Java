import java.util.*;
public class testmode {
	public static void main(String[] args) {
		double[] array = {1,4,6,2,6,9,34,6,2,56,24,6,32,7,2,5,57,2,657,24,65,23,76,43,76,2,6,3,7};

		double key = array[0];
		int tempcnt = 1;
		int maxcnt = tempcnt;

		Arrays.sort(array);


		for (int i = 1; i < array.length; i++) {
			if (array[i] == array[0]) {
				tempcnt += 1;
				maxcnt = tempcnt;
			} else if (array[i] == array[i-1]) {
				tempcnt += 1;
			} else {
				if (tempcnt > maxcnt) {
					maxcnt = tempcnt;
					key = array[i-1];
				}
				tempcnt = 1; 
			}
		}
		System.out.println(key + " " + maxcnt);
	}
}