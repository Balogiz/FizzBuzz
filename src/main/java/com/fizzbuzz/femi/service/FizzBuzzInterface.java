package com.fizzbuzz.femi.service;



public interface FizzBuzzInterface {

    //An interface method to be used in the Controller for the application to print the number from 1 to 100
    // but for multiples of three prints out "Fizz"
    // and for the multiples of five print "Buzz"
    void setFizzBuzz(int i);

    // Stage 2 requirements

    //A number is Buzz if it is divisible by 5 or if it has 5 in it
    String buzz(int i);

    //A number is Fizz if it is divisible by 3 or if it has 3 in it
    String fizz(int i);

    //A number is FizzBuzz if it satisfies the above 2 criteria together
    String fizzBuzz(int i);

}
