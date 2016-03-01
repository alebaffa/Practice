package com.alebaffa.learn.kata;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by alebaffa on 2/28/16.
 */
public class Player {

    String playerName;
    private Deque<Card> cards = new ArrayDeque<>();
    private Deque<Card> pile = new ArrayDeque<>();

    public Player(String name) {
        this.playerName = name;
    }

    public String getPlayerName() { return playerName; }

    public int getTotalCards(){ return getCards().size() + getPile().size(); }

    public Deque<Card> getPile() {
        return pile;
    }

	public void pileCard(Card card) {getPile().push(card);}

	public Card popFromPile(){return getPile().pop();}

	public boolean hasCards() {
		return getCards().size() > 0;
	}

    public Deque<Card> getCards() {
        return cards;
    }

	public boolean hasCardsInPile() {
		return getPile().size() > 0;
	}

	public void addCard(Card card) {
		getCards().push(card);
	}

    public Card popFromCards(){return getCards().pop();}

}
