package uk.co.ijump.fizzbuzz;

public final class FizzBuzz {

	public String FizzBuzzForNumber(int Number) {

		String result = null;

		if (((Number % 3) == 0)  && ((Number % 5) == 0)) {
			result = "fizzbuzz";
		} else if ((Number % 3) == 0) {
			result = "fizz";
		} else if ((Number % 5) == 0) {
			result = "buzz";
		} else {
			result = Integer.toString(Number);
		}	
		return result;
	}
}


