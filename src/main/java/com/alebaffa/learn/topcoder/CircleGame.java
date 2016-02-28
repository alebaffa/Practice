package com.alebaffa.learn.topcoder;

public class CircleGame {

	public static void main(String[] args) {
		int[] deck = { 2, 9, 8, 2 };
		int S = 13;
		System.out.println(cardsLeft(deck, S));

	}

	public static int cardsLeft(int[] deck, int sum) {
		/*
		 * Set Min[i] equal to Infinity for all of i Min[0]=0
		 * 
		 * For i = 1 to S For j = 0 to N - 1 If (Vj<=i AND Min[i-Vj]+1<Min[i])
		 * Then Min[i]=Min[i-Vj]+1
		 * 
		 * Output Min[S]
		 */
		int[] Min = {1000};
		Min[0] = 0;
		for (int i = 1; i < sum; i++) {
			for (int j = 0; j < Min.length; j++) {
				if (deck[j] <= i && Min[i - deck[j]] + 1 < Min[i])
					Min[i] = Min[i - deck[j]] + 1;
			}
		}
		return Min[sum];
	}

}
