package com.alebaffa.learn.codingame;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Don't let the machines win. You are humanity's last hope...
 **/
class Player {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int width = in.nextInt(); // the number of cells on the X axis
		int height = in.nextInt(); // the number of cells on the Y axis
		in.nextLine();

		boolean[][] nodes = new boolean[height][width];

		// Fill array
		for (int i = 0; i < height; i++) {
			String line = in.nextLine(); // width characters, each either 0 or .
			CharSequence cs = line;

			for (int j = 0; j < cs.length(); j++) {
				nodes[i][j] = (cs.charAt(j) == '0');
			}
		}

		// Find neighbors
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				int x1 = -1, y1 = -1;
				int x2 = -1, y2 = -1;
				int x3 = -1, y3 = -1;

				if (nodes[i][j]) {
					x1 = j;
					y1 = i;

					int nextJ = j;
					while (++nextJ < width && x2 == -1) {
						if (nodes[i][nextJ]) {
							x2 = nextJ;
							y2 = i;
						}
					}

					int nextI = i;
					while (++nextI < height && y3 == -1) {
						if (nodes[nextI][j]) {
							x3 = j;
							y3 = nextI;
						}
					}

					System.out.println(x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3);
				}
			}
		}

		// Write an action using System.out.println()
		// To debug: System.err.println("Debug messages...");

		// System.out.println("0 0 1 0 0 1"); // Three coordinates: a node, its
		// right neighbor, its bottom neighbor
	}
}