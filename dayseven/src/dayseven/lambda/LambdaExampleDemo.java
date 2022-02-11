package dayseven.lambda;

public class LambdaExampleDemo {

	public static void main(String[] args) {
		
		LambdaExample lambdaExample = ()->"Hello";
		System.out.println(lambdaExample.fun());
		
		LambdaExample lambdaEx = new LambdaExampleImpl();
		System.out.println(lambdaEx.fun());

	}

}
