package com.alebaffa.learn.kata;

/**
 * Created by alebaffa on 2/28/16.
 */
public class Card implements Comparable{
	int value;

	public Card(int value){
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	@Override
	public int compareTo(Object o) {
		Card card = (Card)o;
		if(this.getValue() == card.getValue())
			return 0;
		else
			return this.getValue() > card.getValue() ? 1 : -1;
	}
}
