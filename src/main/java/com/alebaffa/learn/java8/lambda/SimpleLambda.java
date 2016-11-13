package com.alebaffa.learn.java8.lambda;

/**
 * Created by alebaffa on 13/11/16.
 */

import java.util.Arrays;
import java.util.List;

public class SimpleLambda {

    public static void main(String[] args) {
        Person p = message -> System.out.println("You say, '" + message + "'");
        Method m = (num, num2) -> num + num2;

        doSomeOperations(1, 2, m);
        saySomething("ciao", p);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(System.out::print);
    }

    private static void doSomeOperations(int num, int num2, Method method) {
        int result = method.Operate(num, num2);
        System.out.println("the result is: " + result);
    }

    private static void saySomething(String message, Person p) {
        p.SaySomething(message);
    }

    interface Person {
        void SaySomething(String message);
    }

    interface Method {
        int Operate(int num, int num2);
    }


}

