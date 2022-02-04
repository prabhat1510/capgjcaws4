package corejavaexample.main.staticex;

public class StudentMainApp {

	public static void main(String[] args) {
		Student studentOne = new Student(1,"Aditya");
		Student studentTwo = new Student(2,"Rajesh");
		
		studentOne.display();
		studentTwo.display();
		System.out.println("************After Changing the value***************");
		Student.collegeName ="IITK";
		studentTwo.display();
		studentOne.display();
		System.out.println("***************************");
		studentOne.collegeName ="IITB";
		studentOne.display();
		studentTwo.display();
		
		System.out.println("************Changing value of static variable using static method***************");
		Student.changeCollegeName(); //calling the changeCollegeName method
		studentOne.display();
		studentTwo.display();
	}

}
