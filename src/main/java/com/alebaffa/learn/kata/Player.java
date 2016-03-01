package com.alebaffa.learn.kata;

/**
 * Created by alebaffa on 2/28/16.
 */
public class Player {

String playerName;
private java.util.Deque<Card> cards = new java.util.ArrayDeque<>();
private java.util.Deque<Card> pile = new java.util.ArrayDeque<>();

public Player(String name) {
    this.playerName = name;
}

public String getPlayerName() { return playerName; }

public boolean hasCards() {
    return getCards().size() > 0;
}

public void addCard(Card card) {
    getCards().push(card);
}

public void pileCard(Card card) {getPile().push(card);}

public int getTotalCards(){ return getCards().size() + getPile().size(); }

public java.util.Deque<com.alebaffa.learn.kata.Card> getPile() {
    return pile;
}

public java.util.Deque<com.alebaffa.learn.kata.Card> getCards() {
    return cards;
}
}
