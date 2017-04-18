public class tRand {
	static int high;
	static int low;
	static double random;
	static int rand;

	tRand(int high, int low) {
		tRand.high = high;
		tRand.low = low;
		random = Math.random();
		rand = random * (high - low + 1) + low;

		return(rand);
	}

	static String toString() {
		String detail 	= "Random number generated between" 
						+ low + "and " + high 
						+ " is: " + rand;
		return(detail);
	}
}