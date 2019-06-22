package com.thoughtworks.tdd;

/**
 * @author: woodpecker
 * @Date: 2019/6/22 21:28
 */
public class FizzBuzzGame {
    public String fizzBuzz(int number) {
        String result = "";
        if(number % 3 == 0 ) {
            result = "Fizz";
        }
        if(number % 5 == 0 ) {
            result += "Buzz";
        }
        if(number % 7 == 0 ) {
            result += "Whizz";
        }
        if("".equals(result)) {
            result += number;
        }
        return result;
    }
}
