package com.lambdas.test.lambdas;

import java.util.*;
import java.util.function.Consumer;

public class Sample04 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Lambda");
        numbers.forEach(e -> System.out.println(e));

        System.out.println("Lambda - Method reference");
        numbers.forEach(System.out::println);

        // Use Stream as a toolbox on your collections.
        System.out.println("Stream - String");
        numbers.stream()
                .map(e -> String.valueOf(e)) //Map Integer to a String
                .forEach(System.out::println);

        System.out.println("Stream - Method reference");
        numbers.stream()
                .map(String::valueOf)
                .forEach(System.out::println);

        System.out.println("Stream - String.toString");
        numbers.stream()
                .map(e -> String.valueOf(e))
                // .map(e -> e.toString())
                .map(String::toString)
                .forEach(System.out::println);

        System.out.println("Stream - Reduce sum");
        System.out.println(
                numbers.stream()
                    // .reduce(0, (total, e) -> Integer.sum(total, e)));
                    .reduce(0, Integer::sum));

        System.out.println("Stream - Reduce concat");
        System.out.println(
                numbers.stream()
                .map(String::valueOf)
                // .reduce("", (carry, str) -> carry.concat(str)));
                .reduce("", String::concat));
    }

}
