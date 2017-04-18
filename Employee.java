public class Employee {

	static String companyName = "Feel Good Inc."; 	// static field
	static int employeeCnt;							

	String position;								// instance field
	String lastname;
	String firstname;
	String sex;
	int age;

	Employee(String title, String last, String first, 
			 String x, int old) {					// Constructor
		position = title;
		lastname = last;
		firstname = first;
		sex = x;
		age = old;

		employeeCnt += 1;
	}

	static void companyInfo() {						// static method
		System.out.println("Company " + companyName);
		System.out.println("Employee number" + employeeCnt);
	}

	static int getEmployeeCount() {
		return (employeeCnt);
	}

	String getFullname(String prefix) {				// instance method
		String fullname = prefix + " " + firstname + " " + lastname;
		return(fullname);
	}


}