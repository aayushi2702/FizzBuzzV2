package com.fizzbuzz.testdrivendev;

public class FizzBuzzGameService {
	public static String getFizzBuzzGameOutput(int number) {
		if (number % 3 == 0)
			return "Fizz";
		else if (number % 5 == 0)
			return "Buzz";
		return String.valueOf(number);
	}

}
