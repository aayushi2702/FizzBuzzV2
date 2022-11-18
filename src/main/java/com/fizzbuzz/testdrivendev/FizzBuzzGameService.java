package com.fizzbuzz.testdrivendev;

public class FizzBuzzGameService {
	public static String getFizzBuzzGameOutput(int number) {
		if (number == 3)
			return "Fizz";
		return String.valueOf(number);
	}
}
