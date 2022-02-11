package dayseven.lambda;

public class MaxFinderImpl implements MaxFinder {

	@Override
	public int maximum(int num1, int num2) {
		
		return num1>num2?num1:num2;
	}

}
