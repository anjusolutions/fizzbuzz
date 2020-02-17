package com.test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzMain {

    public static final String BUZZ = "Buzz";
    public static final String FIZZ = "Fizz";
    public static final String FIZZBUZZ = "FizzBuzz";

    public static void main(String a[]) {
        System.out.println(fun(100));
    }

    public static String fun(int number) {
        return IntStream.rangeClosed(1, number).mapToObj(num -> (
                num % 15 == 0 ? FIZZBUZZ : num % 5 == 0 ? BUZZ : num % 3 == 0 ? FIZZ : String.valueOf(num)
        )).collect(Collectors.joining("\n"));
    }
}
