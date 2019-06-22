package com.thoughtworks.tdd;


import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author: woodpecker
 * @Date: 2019/6/22 21:24
 * 特殊数为3、5、7，下面的例子都是以某个数是否为特殊数的整数倍为例。
 */
public class FizzBuzzGameTest {
    FizzBuzzGame game;

    @BeforeEach
    public void init() {
        //given
        game = new FizzBuzzGame();
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_input_is_a_multiple_of_3_and_5_and_7() {
        //when
        String actualStr1 = game.fizzBuzz(105);
        String actualStr2 = game.fizzBuzz(210);

        //then
        assertThat(actualStr1, is("FizzBuzzWhizz"));
        assertThat(actualStr2, is("FizzBuzzWhizz"));
    }

    @Test
    public void should_return_FizzBuzz_when_input_is_a_multiple_of_3_and_5_only() {
        //when
        String actualStr1 = game.fizzBuzz(15);
        String actualStr2 = game.fizzBuzz(30);

        //then
        assertThat(actualStr1, is("FizzBuzz"));
        assertThat(actualStr2, is("FizzBuzz"));
    }

    @Test
    public void should_return_FizzWhizz_when_input_is_a_multiple_of_3_and_7_only() {
        //when
        String actualStr1 = game.fizzBuzz(21);
        String actualStr2 = game.fizzBuzz(42);

        //then
        assertThat(actualStr1, is("FizzWhizz"));
        assertThat(actualStr2, is("FizzWhizz"));
    }

    @Test
    public void should_return_BuzzWhizz_when_input_is_a_multiple_of_5_and_7_only() {
        //when
        String actualStr1 = game.fizzBuzz(35);
        String actualStr2 = game.fizzBuzz(70);
        //then
        assertThat(actualStr1, is("BuzzWhizz"));
        assertThat(actualStr2, is("BuzzWhizz"));
    }

    @Test
    public void should_return_Fizz_when_input_is_a_multiple_of_3_only() {
        String actualStr1 = game.fizzBuzz(3);
        String actualStr2 = game.fizzBuzz(6);
        assertThat(actualStr1, is("Fizz"));
        assertThat(actualStr2, is("Fizz"));
    }

    @Test
    public void should_return_Buzz_when_input_is_a_multiple_of_5_only() {
        assertThat(game.fizzBuzz(5), is("Buzz"));
        assertThat(game.fizzBuzz(10), is("Buzz"));
    }

    @Test
    public void should_return_Whizz_when_input_is_a_multiple_of_7_only() {
        assertThat(game.fizzBuzz(7), is("Whizz"));
        assertThat(game.fizzBuzz(14), is("Whizz"));
    }

    @Test
    public void should_return_n_when_input_n_except_above_situations() {
        assertThat(game.fizzBuzz(1), is("1"));
        assertThat(game.fizzBuzz(2), is("2"));
        assertThat(game.fizzBuzz(4), is("4"));
    }
}
