public class course{
	// create instance fields:
	String courseID;
	String description;
	String instructor;
	double credits;
	double grades;

	// constructor #1:
	course(	String id, String description, 
			String instructor, double credits) {
		this(id, description, instructor);
		this.credits = credits;
	}

	// constructor #2:
	course(String id, String description, String instructor) {
		this.courseID = id;
		this.description = description;
		this.instructor = instructor;
	}

	// getters & setters
	String getID() {
		return(this.courseID);
	}

	Void setID(String ID) {
		this.courseID = ID;
	}

	String getDescription() {
		return(this.description);
	}

	void setDescription(String description) {
		this.description = description;
	}

	String getInstructor() {
		return(this.instructor);
	}

	void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	double getCredits() {
		return(this.credits);
	}

	void setCredits(double credits) {
		this.credits = credits;
	}

	double getGrades() {
		return(this.grades);
	}

	void setGrades(double grades) {
		this.grades = grades;
	}

	public String toString() {
		String detail 	= "Course ID: "
						+ courseID
						+ "\t Description: "
						+ description
						+ "\t Instructor: "
						+ instructor
						+ "\t Credits: "
						+ credits
						+ "\t Grades: "
						+ grades
						+ "\n";
	}
}