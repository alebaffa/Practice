package com.alebaffa.learn.topcoder;

import java.util.HashSet;
import java.util.Set;

public class DitheringImage {

	public static int count(String dithered, String[] screen) {
		int count = 0;
		Set<Character> colors = new HashSet<>();

		for (char c : dithered.toCharArray()) {
			colors.add(c);
		}

		for (String pixels : screen) {
			for (char pix : pixels.toCharArray()) {
				if (colors.contains(pix))
					count++;
			}
		}
		return count;
	}

}
