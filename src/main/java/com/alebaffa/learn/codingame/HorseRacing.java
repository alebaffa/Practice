package com.alebaffa.learn.codingame;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement.
 **/
class Solution {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		List<Integer> listOfPi = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			int pi = in.nextInt();
			listOfPi.add(pi);
		}
		Collections.sort(listOfPi);
		int gap = 1000000000;
		int temp = 0;
		for (int i = 0; i < listOfPi.size() - 1; i++) {
			temp = listOfPi.get(i + 1) - listOfPi.get(i);
			if (temp < gap) {
				gap = temp;
			}
		}
		System.out.println(gap);

	}
}