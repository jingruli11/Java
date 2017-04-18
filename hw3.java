import java.util.*;
public class hw3 {

	public static void main(String[] args) {
		// Check to make sure words entered are more than or equal to 3.
		if (args.length < 3) {
			System.out.println("Please enter at least 3 words. ");
			System.exit(-1);
		}
		
		// Print each words in a seperate line.
		for (int i = 0; i < args.length; i++) {
			System.out.println(i + " argument is: " + args[i]);
		}

		// Convert arguments into a single string.
		String singleStr = new String();
		for (int i = 0; i < args.length; i++) {
			singleStr += args[i] + " ";
		}

		// Print the string.
		System.out.println(singleStr);

		// Sort words and print each one on a seperate line.
		String[] sortedArgs = sorting(args);

		// Print sorted words each on a seperate line.
		System.out.println("\nSorted words are: ");
		for (int i = 0; i < sortedArgs.length; i++)
			System.out.println(sortedArgs[i]);

		// Convert the words into a StringBuffer.
		StringBuffer strBf = new StringBuffer();
		for (int i = 0; i < sortedArgs.length; i++) {
			strBf.append(sortedArgs[i]);
			strBf.append(" ");
		}

		//Print the StringBuffer.
		System.out.println("\n"+strBf);

	}

	// Method to sort string items in ascending order. (bubble sort)
	static String[] sorting(String[] input) {
		// Declare a temporary string variable.
		String temp;
		// Loop for each element in the array.
		for (int i = 0; i < input.length; i++) {
			// Loop for each element on the right of the target one.
			for (int j = i + 1; j < input.length; j++) {
				// Compare the items (ingore case) and make switch if appropriate.
				if (input[i].compareToIgnoreCase(input[j]) > 0) {
					// Make switch.
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		return input;
	}

}
