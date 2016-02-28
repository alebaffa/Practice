package com.alebaffa.learn.codingame;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement.
 **/
class Solution2 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String MESSAGE = in.nextLine();
		char[] messageChar = MESSAGE.toCharArray();
		StringBuilder binaryString = convertCharToBinary(messageChar);

		printSolution(binaryString);
		in.close();
	}

	private static void printSolution(StringBuilder binaryString) {
		int i = 0;
		char currentChar;

		while (i < binaryString.length()) {

			if (binaryString.charAt(i) == '0') {
				System.out.print("00 ");
				currentChar = '0';
			} else {
				System.out.print("0 ");
				currentChar = '1';
			}

			while (binaryString.charAt(i) == currentChar) {
				System.out.print("0");
				i++;
				if (i >= binaryString.length())
					break;
			}
			if (i < binaryString.length())
				System.out.print(" ");
		}
	}

	private static StringBuilder convertCharToBinary(char[] messageChar) {
		StringBuilder binaryString = new StringBuilder();

		for (char character : messageChar) {
			String res = Integer.toBinaryString(character);

			while (res.length() < 7)
				res = '0' + res;

			binaryString.append(res);
		}
		return binaryString;
	}
}
