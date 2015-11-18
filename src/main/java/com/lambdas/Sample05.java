package com.lambdas;

import java.util.*;
import java.util.function.Consumer;

public class Sample05 {

  public static void main(String[] args) {
      
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    /* a05: Function composition */
    
    //given the values, double the even numbers and total.
    
    int result = 0;
    
    // Traditional 'for' loop
    // Difficult to read, your 'eyes' go up and down to understand.
    for(int e : numbers) {
      if(e % 2 == 0) {
        result += e * 2;
      }
    }
    System.out.println(result);
    
    //Function Composition with streams.
    System.out.println(
      numbers.stream()
             .filter(e -> e % 2 == 0)
             .mapToInt(e -> e * 2)
             .sum());
  }

}
