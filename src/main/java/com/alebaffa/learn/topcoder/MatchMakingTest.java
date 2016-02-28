package com.alebaffa.learn.topcoder;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatchMakingTest {

	@Test
	public void test() {
		String[] namesWomen = { "Constance", "Bertha", "Alice" };
		String[] answersWomen = { "aaba", "baab", "aaaa" };
		String[] namesMen = { "Chip", "Biff", "Abe" };
		String[] answersMen = { "bbaa", "baaa", "aaab" };
		String queryWoman = "Bertha";

		MatchMaking matchmaker = new MatchMaking();
		assertEquals("Biff", matchmaker.makeMatch(namesWomen, answersWomen, namesMen, answersMen, queryWoman));
	}

	@Test
	public void test1() {
		String[] namesWomen = { "Constance", "Bertha", "Alice" };
		String[] answersWomen = { "aaba", "baab", "aaaa" };
		String[] namesMen = { "Chip", "Biff", "Abe" };
		String[] answersMen = { "bbaa", "baaa", "aaab" };
		String queryWoman = "Constance";

		MatchMaking matchmaker = new MatchMaking();
		assertEquals("Chip", matchmaker.makeMatch(namesWomen, answersWomen, namesMen, answersMen, queryWoman));
	}

}
