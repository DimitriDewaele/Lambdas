package com.lambdas.test.lambdas;

import java.util.*;

public class Sample {
  public static void main(String[] args) {
      
    //Anonymous inber function has 4 things:
    //1. name - anonymous
          //2. parameter list
          //3. body
    //4. return type - inferred
      
    // NO Lamba's
    //    Thread th = new Thread(new Runnable() {
    //      public void run() {
    //        System.out.println("In another thread");
    //      }
    //    });
    //    th.start();
   


    // WITH Lambda
    Thread th = new Thread(() -> System.out.println("In another thread"));
    th.start();
    
    System.out.println("In main");
  }
}