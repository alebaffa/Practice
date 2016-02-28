package com.alebaffa.learn.topcoder;

public class CCipher {

	public String decode(String string, int shift) {
		char[] chArray = string.toCharArray();

		for (int i = 0; i < chArray.length; i++) {
			int c = chArray[i] - shift;

			// If before 'A' - wrap around to the end.
			if (c < 'A') {
				c += 26;
			}
			chArray[i] = (char) c;
		}
		return chArray.toString();
	}

}
