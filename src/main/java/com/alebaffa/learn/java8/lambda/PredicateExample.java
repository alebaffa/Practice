package com.alebaffa.learn.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.alebaffa.learn.java8.Apple;

public class PredicateExample {

	private static List<Apple> inventory = null;

	private static void initInventory() {
		inventory = Arrays.asList(new Apple("green", 1), new Apple("red", 2));
	}

	public static void main(String[] args) {
		// initialize
		initInventory();
		// classic Java way
		filterGreenApples(inventory);
		// Java 8 by passing a method as input (using Predicate)
		filterGreenApplesWithJava8(inventory, PredicateExample::isGreenApple);
		// Java 8 by passing a lambda (anonymous method) as input. In this case
		// i am using the lambda as Predicate.
		filterGreenApplesWithJava8(inventory, (Apple a) -> "green".equals(a.getColor()));
	}

	// The classic way to filter over a collection.
	public static void filterGreenApples(List<Apple> inventory) {
		for (Apple apple : inventory) {
			if ("green".equals(apple.getColor())) {
				System.out.println("[Classic Java] The apple is green.");
			}
		}
	}

	// The Java 8 way to filter over a collection. I am passing a Predicate
	// object: it takes a predicate (in this case a method) as input and returns
	// true or false.
	public static void filterGreenApplesWithJava8(List<Apple> inventory, Predicate<Apple> p) {
		for (Apple apple : inventory) {
			if (p.test(apple)) {
				System.out.println("[Java 8] The apple is green.");
			}
		}
	}

	public static boolean isGreenApple(Apple apple) {
		return "green".equals(apple.getColor());
	}

}
