
package com.alebaffa.learn.codingame;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement.
 **/
class Solution3 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); // Number of elements which make up the
								// association table.
		int Q = in.nextInt(); // Number Q of file names to be analyzed.

		Map<String, String> mimeTable = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String EXT = in.next(); // file extension
			String MT = in.next(); // MIME type.
			mimeTable.put(EXT.toLowerCase(), MT);
			in.nextLine();
		}

		for (int i = 0; i < Q; i++) {
			String FNAME = in.nextLine(); // One file name per line.
			String extension = "";
			int index = FNAME.lastIndexOf('.');

			// extension found
			if (index >= 0) {
				extension = FNAME.substring(index + 1).toLowerCase();

				if (mimeTable.containsKey(extension)) {
					System.out.println(mimeTable.get(extension));
				} else {
					System.out.println("UNKNOWN");
				}
			}
			// extension not found
			else {
				System.out.println("UNKNOWN");
			}

		}
	}
}