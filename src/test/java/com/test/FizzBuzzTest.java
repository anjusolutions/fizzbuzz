package com.test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void shouldReturnEmptyWhenFunIsZero(){
        assertThat(FizzBuzzMain.fun(0).isEmpty(), is(true));
    }

    @Test
    public void shouldReturnNumber(){
        assertThat(FizzBuzzMain.fun(2), CoreMatchers.allOf(containsString("1"), containsString("2")));
        assertTrue(!FizzBuzzMain.fun(2).contains(FizzBuzzMain.FIZZ));
    }

    @Test
    public void shouldReturnFizzWhenDivisibleBy3() {
        assertThat(FizzBuzzMain.fun(3), containsString(FizzBuzzMain.FIZZ));
        assertThat(FizzBuzzMain.fun(12), containsString(FizzBuzzMain.FIZZ));
        assertThat(FizzBuzzMain.fun(99), containsString(FizzBuzzMain.FIZZ));
    }

    @Test
    public void shouldReturnBuzzWhenDivisibleBy5() {
        assertThat(FizzBuzzMain.fun(5), containsString(FizzBuzzMain.BUZZ));
        assertThat(FizzBuzzMain.fun(10), containsString(FizzBuzzMain.BUZZ));
        assertThat(FizzBuzzMain.fun(100), containsString(FizzBuzzMain.BUZZ));
    }

    @Test
    public void shouldReturnFizzBuzzWhenDivisibleBy3And5() {
        assertThat(FizzBuzzMain.fun(35), containsString(FizzBuzzMain.FIZZBUZZ));

        assertThat(FizzBuzzMain.fun(35), CoreMatchers.anyOf(containsString(FizzBuzzMain.FIZZ),
                containsString(FizzBuzzMain.BUZZ), containsString(FizzBuzzMain.FIZZBUZZ)));
    }
}
