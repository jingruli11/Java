public class hw4 {
	public static void main(String[] args) {

		// Create an array of students
		student[] people = new student[10];

		// Instantiate objects using small constructor
		people[0] = new student("Daenerys", "Targaryen");
		people[1] = new student("Rhaergar", "Targaryen");
		people[2] = new student("Tywin", "Lannister");
		people[3] = new student("Jamie", "Lannister");
		people[4] = new student("Cersie", "Lannister");

		// Instantiate objects using large constructor
		people[5] = new student("Tyrion", "Lannister", "Casterly Rock", 
								"Westerlands", "Westeros", "tyrion@got.edu");
		people[6] = new student("Jon", "Snow", "Winterfell", 
								"The North", "Westeros", "jonsnow@got.edu");
		people[7] = new student("Sansa", "Stark", "Winterfell", 
								"The North", "Westeros", "sansastark@got.edu");
		people[8] = new student("Arya", "Stark", "The Twins", 
								"The Riverlands", "Westeros", "aryastark@got.edu");
		people[9] = new student("Brandon", "Stark", "Beyond the Wall", 
								"The North", "Westeros", "branstark@got.edu");

		// Print each object
		for (int i = 0; i < people.length; i++) {
			p(people[i].toString());
		}

		// Call getter & setter to alter information
		// Static Getter:
		String className = student.getClassName();
		String classNumber = student.getClassNumber();
		String instructor = student.getInstructor();
		// Instance Getter:
		String last3 = people[3].getLastName();
		String address7 = people[7].getAddress();
		String first0 = people[0].getFirstName();
		// Static Setter:
		student.setInstructor("David Benioff & D. B. Weiss");
		// Instance Setter:
		people[0].setAddress("The Narrow Sea");
		people[3].setAddress("King's Landing");
		people[3].setCity("The Crownlands");
		people[4].setAddress("King's Landing");
		people[6].setEmail("kinginthenorth@got.edu");

		// Reprint objects
		p(	"-----------------------" + "\nReprint objects:\n" 
			+ "-----------------------" + "\n");

		for (int i = 0; i < people.length; i++) {
			p(people[i].toString());
		}

	}	

	static void p(String x) {
		System.out.println(x);
	} 
}