package corejavaexample.main.staticex;

public class Student {
	//instace variable	
	private Integer rollNumber;
	//instace variable
	private String studentName;
	//class or static variable
	static String collegeName ="IIT";
	
	
	
	public Student(Integer rollNumber, String studentName) {
		this.rollNumber = rollNumber;
		this.studentName = studentName;
	}



	void display() {
		System.out.println("rollNumnber ----"+rollNumber+"--studentName---"+studentName+"----college---"+collegeName);
	}
	
	//Static method to change the value of static variable
	static void changeCollegeName() {
		collegeName="LNCT Bhopal";
	}
}
