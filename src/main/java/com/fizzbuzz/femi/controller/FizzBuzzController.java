package com.fizzbuzz.femi.controller;

import com.fizzbuzz.femi.service.FizzBuzzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FizzBuzzController {

    @Autowired
    FizzBuzzService fizzBuzzService;

    public FizzBuzzController(FizzBuzzService fizzBuzzService) {
        this.fizzBuzzService= fizzBuzzService;
    }

    //Controller method to be used in the main application class to print out the number from 1 to 100 but for multiples of three prints out "Fizz"
    //and for the multiples of five print "Buzz"
    public void printFizzBuzz(){

        fizzBuzzService.setFizzBuzz(100);

    }
}
