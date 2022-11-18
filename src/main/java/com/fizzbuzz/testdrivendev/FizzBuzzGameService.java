package com.fizzbuzz.testdrivendev;

public class FizzBuzzGameService {
	public static String getFizzBuzzGameOutput(int number) {
		if (isMultipleOf3(number) && isMultipleOf5(number))
			return "FizzBuzz";
		else if (isMultipleOf3(number))
			return "Fizz";
		else if (isMultipleOf5(number))
			return "Buzz";

		return String.valueOf(number);
	}

	private static boolean isMultipleOf3(int number) {
		return number % 3 == 0;
	}

	private static boolean isMultipleOf5(int number) {
		return number % 5 == 0;
	}
}
