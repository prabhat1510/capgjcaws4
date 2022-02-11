package dayseven.lambda;

public class MaxFinderDemo {

	public static void main(String[] args) {
	//traditional approach
	MaxFinder finder = new MaxFinderImpl();
	int result = finder.maximum(10, 20);
	System.out.println(result);

	//Using Lambda expression
	//Return type of lambda expression is Functional Interface
	//Lambda expression represents an instance of functional interface
	//A Lamdba expression is an anonymous block of code that encapsulates an expression or a block of statements and returns a result
	//(argument list) -> {implementation}
	//MaxFinderImpl maxFinder= (num1,num2)->num1>num2?num1:num2; 
	
	MaxFinder maxFinder= (num1,num2)->num1>num2?num1:num2;
	int max = maxFinder.maximum(10, 20);
	System.out.println(max);
	}

}
