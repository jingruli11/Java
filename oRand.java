public class oRand {
	int high;
	int low;
	double random;
	int rand;

	tRand(int high, int low) {
		this.high = high;
		this.low = low;
	}

	int genRand() {
		double random = Math.random();
		rand = random * (high - low + 1) + low;
		return(rand);
	}

	public String toString() {
		String detail 	= "Random number generated between" 
						+ low + "and " + high
						+ "with initial random number "
						+ random
						+ "is: " + rand;
		return(detail);
	}
}