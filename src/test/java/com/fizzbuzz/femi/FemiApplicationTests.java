package com.fizzbuzz.femi;

import com.fizzbuzz.femi.service.FizzBuzzService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


@SpringBootTest
class FemiApplicationTests {

	//inject the Service into the Test class
	@Autowired
	private FizzBuzzService fizzBuzzService;

	@Test
	void contextLoads() {
	}

	@Test
	public  void testFizzBuzz() {

		assertEquals("FizzBuzz", fizzBuzzService.fizzBuzz(15));
		assertNotEquals("Buzz", fizzBuzzService.fizzBuzz(15));
		assertNotEquals("Fizz", fizzBuzzService.fizzBuzz(15));
	}
	@Test
	public  void testFizz() {

		assertEquals("Fizz", fizzBuzzService.fizz(6));
		assertNotEquals("Buzz", fizzBuzzService.fizz(6));
		assertNotEquals("FizzBuzz", fizzBuzzService.fizz(6));
	}

	@Test
	public  void testBuzz() {

		assertEquals("Buzz", fizzBuzzService.buzz(5));
		assertNotEquals("Fizz", fizzBuzzService.buzz(5));
		assertNotEquals("FizzBuzz", fizzBuzzService.buzz(5));
	}

	@Test
	public  void testNonMultiplesOfThreeOrFive() {

		assertEquals("4", fizzBuzzService.fizzBuzz(4));
		assertNotEquals("Fizz", fizzBuzzService.fizzBuzz(4));
		assertNotEquals("Buzz", fizzBuzzService.fizzBuzz(4));
		assertNotEquals("FizzBuzz", fizzBuzzService.fizzBuzz(4));
	}
}
