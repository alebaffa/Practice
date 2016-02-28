package com.alebaffa.learn.practice;

public class BitDifference {

	public static void main(String[] args) {
		int[] arr = { 1, 2 };
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int val = arr[i] ^ arr[j];
				while (val != 0) {
					count++;
					val &= val - 1;
				}
			}
		}

		System.out.println(count);

	}

}
