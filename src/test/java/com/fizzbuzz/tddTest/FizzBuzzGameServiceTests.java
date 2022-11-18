package com.fizzbuzz.tddTest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.fizzbuzz.testdrivendev.FizzBuzzGameService;

public class FizzBuzzGameServiceTests {

	private FizzBuzzGameService fizzBuzzGameService;

	@Before
	public void setUp() {
		fizzBuzzGameService = new FizzBuzzGameService();
	}

	@Test
	public void getFizzBuzzGameOutput_ReturnsNumberItself() {
		assertThat(fizzBuzzGameService.getFizzBuzzGameOutput(1), is("1"));
	}

}