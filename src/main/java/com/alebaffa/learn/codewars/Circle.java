package com.alebaffa.learn.codewars;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class Circle {
	  public static double area(double radius) {
	      if (radius <= 0D) throw new IllegalArgumentException();
	      /* BigDecimal is used for big precision numbers, when float numbers are only an approximation and so not reliable.
	      In this case the decimal numbers could be several numbers, so better to use BigDecimal.
	      BigDecimal provides aritmetics such as setScale, where you can set the round numbers moves and also if up or down.
	      Then you have to convert it to double.*/
	      return (new BigDecimal(Math.PI * radius*radius).setScale(2, RoundingMode.HALF_UP).doubleValue());
	  }
	}
