package com.alebaffa.learn.java8;

import java.util.ArrayList;
import java.util.List;
import java.lang.System;
import java.util.function.Predicate;

/**
 * Created by ale on 28/01/2016.
 */
public class BehaviourClass {

    public static void main ( String[] args ) {
        Apple appleBlue = new Apple ( "blue", 120 );
        Apple appleRed = new Apple ( "red", 5 );
        List<Apple> inventory = new ArrayList ();
        inventory.add ( appleBlue );
        inventory.add ( appleRed );

        // A light blue apple
        // A light red apple
        prettyPrintApple ( inventory,(Apple apple) -> "red".equals ( apple.getColor () ) );
        // An apple of blue color
        //An apple of red color
        prettyPrintApple ( inventory, (Apple apple) -> "blue".equals ( apple.getColor () ));
    }

    public static void prettyPrintApple ( List<Apple> inventory, Predicate<Apple> predicate) {
        for ( Apple apple : inventory ) {
            if (predicate.test(apple)){
                System.out.println ("this is a " + apple.getColor () + " apple");
            }
        }
    }

    public interface AppleFormatter {
        String accept ( Apple a );
    }

    public static class AppleFancyFormatter implements AppleFormatter {
        public String accept ( Apple apple ) {
            String characteristics = apple.getWeight () > 150 ? "heavy" : "light";
            return "A " + characteristics + " " + apple.getColor () + " apple";
        }
    }

    public static class AppleSimpleFormatter implements AppleFormatter {
        public String accept ( Apple apple ) {
            return "An apple of " + apple.getColor () + " color";
        }
    }
}
