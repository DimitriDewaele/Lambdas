package com.lambdas.test.lambdas;

import java.util.*;
import java.util.function.Consumer;

public class Sample03 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // External iterators
        System.out.println("External iterator:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // External iterators also
        System.out.println("External iterator also:");
        for (int e : numbers) {
            System.out.println(e);
        }

        // Internal iterators
        System.out.println("Internal iterator");
        numbers.forEach(new Consumer<Integer>() {
            public void accept(Integer value) {
                System.out.println(value);
            }
        });

        // With Lambda
        System.out.println("With Lambda");
        numbers.forEach((Integer value) -> System.out.println(value));

        // Implicit type: Only for lambda expressions
        System.out.println("With Lambda - implicit type");
        numbers.forEach((value) -> System.out.println(value));

        // Parenthesis is optional: only for one parameter lambdas.
        System.out.println("With Lambda - no parenthesis");
        numbers.forEach(value -> System.out.println(value));

        // Call the class with its function - needs double ::
        System.out.println("With Lambda - Function Call");
        numbers.forEach(System.out::println);
    }
}
