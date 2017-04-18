public class hw1 {
	public static void main (String []args){
		// Input the distance in miles from house to nearest store.
		double miles = 0.5;

		// Convert the distance in miles into other units of measurement.
		double yards = miles * 1760;
		double feet = yards * 3;
		double inches = feet * 12;
		double kilometers = miles * 1.609344;
		double meters = kilometers * 1000;
		double centimeters = meters * 100;
		double millimeters = centimeters * 10;

		// Report the conversion/
		System.out.println("\n------------------------------------\n" + "The distance from home to store is: \n" + "------------------------------------");
		System.out.printf("%10.3f \t\t miles \n", miles);
		System.out.printf("%10.3f \t\t yards \n", yards);
		System.out.printf("%10.3f \t\t feet \n", feet);
		System.out.printf("%10.3f \t\t inches \n", inches);
		System.out.printf("%10.3f \t\t kilometers \n", kilometers);
		System.out.printf("%10.3f \t\t meters \n", meters);
		System.out.printf("%10.3f \t\t centimeters \n", centimeters);
		System.out.printf("%10.3f \t\t millimeters \n\n", millimeters);
		


		// Input volume of milk in gallons purchased in the store.
		double gallons = 0.5;

		// Convert the volume in gallons into other units of measurement.
		double quarts = gallons * 4;
		double pints = quarts * 2;
		double ounces = pints * 16;
		double litters = gallons * 3.78541;
		double milliliters = litters * 1000;

		// Report the conversion.
		System.out.println("\n------------------------------------------\n" + "The volume of milk purchased at store is: \n" + "------------------------------------------");
		System.out.printf("%10.3f \t\t gallons \n", gallons);
		System.out.printf("%10.3f \t\t quarts \n", quarts);
		System.out.printf("%10.3f \t\t pints \n", pints);
		System.out.printf("%10.3f \t\t ounces \n", ounces);
		System.out.printf("%10.3f \t\t litters \n", litters);
		System.out.printf("%10.3f \t\t milliliters \n", milliliters);

	}
}