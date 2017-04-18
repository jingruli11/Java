public class student {

	// Create static fields
	private static String classNumber = "GOTS7";
	private static String className = "Game of Thrones";
	private static String instructor = "George R. R. Martin";
	private static int studentCnt;	

	// Create instance fields
	private int studentID;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String email;

	// Constructor 1
	student(String first, String last) {
		this(first,last,null,null,null,null);
	}

	// Constructor 2
	student(String first, String last, String address, 
			String city, String state, String email) {
		firstName = first;
		lastName = last;
		studentID = 1000 + studentCnt;

		studentCnt += 1;

		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email;
	}



	// Getter & Setter methods for static fields
	static String getClassNumber() {
		return(classNumber);
	}

	static void setClassNumber(String number) {
		classNumber = number;
	}

	static String getClassName() {
		return(className);
	}

	static void setClassName(String name) {
		className = name;
	}

	static String getInstructor() {
		return(instructor);
	}

	static void setInstructor(String instructor) {
		student.instructor = instructor;
	}

	// Getter & Setter methods for instance fields
	int getStudentID() {
		return(studentID);
	}

	void setStudentID(int id) {
		studentID = id;
	}

	String getFirstName() {
		return (firstName);
	}

	void setFirstName(String first) {
		firstName = first;
	}

	String getLastName() {
		return (lastName);
	}

	void setLastName(String last) {
		lastName = last;
	}

	String getAddress() {
		return (address);
	}

	void setAddress(String address) {
		this.address = address;
	}

	String getCity() {
		return (city);
	}

	void setCity(String city) {
		this.city = city;
	}

	String getState() {
		return (state);
	}

	void setState(String state) {
		this.state = state;
	}

	String getEmail() {
		return (email);
	}

	void setEmail(String email) {
		this.email = email;
	}

	// To String method
	public String toString() {
		String detail 	= "Class Number: " 
						+ classNumber 
						+ ";\t Class Name: " 
						+ className 
						+ ";\n Instructor: " 
						+ instructor
						+ ";\n Student ID: "
						+ studentID
						+ ";\n Student Name: "
						+ firstName + " " + lastName
						+ ";\n Address: "
						+ address
						+ ";\t City: "
						+ city
						+ ";\t State: "
						+ state
						+ ";\n Email: "
						+ email
						+ "\n";

		return(detail);
	}

}