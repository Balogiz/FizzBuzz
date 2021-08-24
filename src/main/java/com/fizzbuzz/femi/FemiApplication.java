package com.fizzbuzz.femi;

import com.fizzbuzz.femi.controller.FizzBuzzController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FemiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(FemiApplication.class, args);

		FizzBuzzController fizzBuzzController = ctx.getBean("fizzBuzzController", FizzBuzzController.class);
		//The SpringBoot application prints out the number from 1 to 100 but for multiples of three prints out "Fizz"
		//and for the multiples of five print "Buzz"
		fizzBuzzController.printFizzBuzz();


	}

}
