package com.alebaffa.learn.topcoder;

/**
 * SRM 145 DIV 2 - 500
 * */
public class ExerciseMachine {

	public static void main(String[] args) {
		System.out.println(getPercentages("00:30:00"));
		System.out.println(getPercentages("00:28:00"));
		System.out.println(getPercentages("23:59:59"));
		System.out.println(getPercentages("00:14:10"));

	}

	public static int getPercentages(String time) {
		String[] split = time.split(":");
		int h = Integer.valueOf(split[0]);
		int m = Integer.valueOf(split[1]);
		int s = Integer.valueOf(split[2]);

		int seconds = s + 60 * m + 3600 * h;

		int sum = 0;
		for (int i = 1; i < seconds; i++) {
			if (i * 100 % seconds == 0)
				sum++;
		}
		return sum;
	}

}
