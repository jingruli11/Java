import java.lang.Math;
 public class hw2 {
 	public static void main(String[] args) {
 		// Compose the 10 by 10 multiplication table.
 		printMatrix(10,10);

 		// Generate row number from 1 to 10.
 		int maxR = genRand(1,10);

 		// Generate column number from 1 to 10.
 		int maxC = genRand(1,10);

 		//Compose the multiplication table.
 		System.out.println();
 		printMatrix(maxR , maxC);
 	}
 		
 		// Function to compose matrix.
 		static void printMatrix(int maxRow, int maxCol ) 
 		{

 			// Print column header.
 			System.out.printf("   \t");
 			for (int i = 1; i <=maxCol; i++) {
 				System.out.print("<" + i + ">\t");
 			}

 			// Print each row.
 			for (int j = 1; j <= maxRow; j++) {
 				System.out.print("\n");						// Next line.
 				System.out.print("<" + j +"> ");
 				for (int k = 1; k <= maxCol; k++) {
 					System.out.print("\t" + " " + (j * k) );		// Print each entry.
 				}
 			}
 			System.out.print("\n");

 		}

 		// Function to generate random number from min to max
 		static int genRand(int min, int max)
 		{
 			int r = (int) (Math.random( ) * (max - min + 1));
 			r = r + min;	
 			return r;	
 		}
 	}	

 