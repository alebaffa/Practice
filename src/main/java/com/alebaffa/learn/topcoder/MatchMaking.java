package com.alebaffa.learn.topcoder;

import java.util.Arrays;
import java.util.regex.Pattern;

public class MatchMaking {
	
	public class Person implements Comparable {
		String name;
		String answers;
		boolean active = true;

		public Person(String n, String a) {
			name = n;
			answers = a;
		}

		public int matches(String a) {
			int count = 0;
			for (int i = 0; i < answers.length(); ++i) {
				if (answers.charAt(i) == a.charAt(i))
					++count;
			}
			return count;
		}

		public int compareTo(Object o) {
			Person that = (Person) o;
			return this.name.compareTo(that.name);
		}

	}

	public String makeMatch(String[] namesWomen, String[] answersWomen, String[] namesMen, String[] answersMen,
			String queryWoman) {
		Person[] women = new Person[namesWomen.length];
		Person[] men = new Person[namesMen.length];
		for (int i = 0; i < women.length; ++i) {
			women[i] = new Person(namesWomen[i], answersWomen[i]);
			men[i] = new Person(namesMen[i], answersMen[i]);
		}
		
		Arrays.sort(women);
		Arrays.sort(men);
		for (int i = 0; i < women.length; ++i) {
			int bestMan = -1;
			int best = -1;
			for (int j = 0; j < men.length; ++j) {
				if (!men[j].active)
					continue;
				int matches = women[i].matches(men[j].answers);
				if (matches > best) {
					best = matches;
					bestMan = j;
				}
			}
			men[bestMan].active = false;
			if (women[i].name.equals(queryWoman))
				return men[bestMan].name;
		}
		return null;
	}

}