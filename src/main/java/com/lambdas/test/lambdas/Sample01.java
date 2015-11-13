package com.lambdas.test.lambdas;

import java.util.*;

public class Sample01 {

    private static int count = 1;

    public static void main(String[] args) {

        Thread th;
        
        /* a01: High Ceremony - A thread*/
        
        //Anonymous inner function has 4 things:
            //1. name - anonymous
            //2. parameter list
            //3. body
            //4. return type - inferred

        // NO Lamba's
        th = new Thread(new Runnable() {
            public void run() {
                System.out.println("In a thread without Lambda");
            }
        });
        th.start();

        System.out.println("In main");
    }
}
