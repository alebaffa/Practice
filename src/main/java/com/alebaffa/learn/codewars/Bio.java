package com.alebaffa.learn.codewars;
public class Bio {
	public String dnaToRna(String dna) {
		
		// Solution 1
		String result = "";
		for (char letter : dna.toCharArray()) {
			if (letter == 'T')
				letter = 'U';
			result += String.valueOf(letter);
		}

		return result;
		
		// solution 2
		// return dna.replace('T', 'U');
	}
}
