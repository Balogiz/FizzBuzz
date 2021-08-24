package com.fizzbuzz.femi.service;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService implements FizzBuzzInterface {

    //A method to be used in the Controller for the application to print the number from 1 to 100
    // but for multiples of three prints out "Fizz"
    // and for the multiples of five print "Buzz"
    public void setFizzBuzz(int num) {

        for (int i = 1; i <= num; i++)
        {
            if (((i % 3) == 0) && ((i % 5) == 0)) // If it is a multiple of 5, then print FizzBuzz
                System.out.println("FizzBuzz");
            else if ((i % 3) == 0) // If it is a multiple of 3, then print Fizz
                System.out.println("Fizz");
            else if ((i % 5) == 0) // If it is a multiple of 5, then print Buzz
                System.out.println("Buzz");
            else
                System.out.println(i); // If it is not a multiple of 3 or 5, then print the number
        }

    }

    //A number is FizzBuzz if it satisfies the below 2 criteria together
    public String fizzBuzz(int input) {
        String output = "";
        if (input % 3 == 0) {
            output += "Fizz";
        }
        if (input % 5 == 0) {
            output += "Buzz";
        }
        if (input % 3 != 0 && input % 5 != 0) {
            output = String.valueOf(input);
        }
        return output;
    }


    //A number is Fizz if it is divisible by 3 or if it has 3 in it
    public String fizz(int input) {
        String output = "";
        if (input % 3 == 0) {
            output += "Fizz";
        }

        return output;
    }


    //A number is Buzz if it is divisible by 5 or if it has 5 in it
    public String buzz(int input) {
        String output = "";

        if (input % 5 == 0) {
            output += "Buzz";
        }
        return output;
    }

}
