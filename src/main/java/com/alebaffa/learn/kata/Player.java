package com.alebaffa.learn.kata;

/**
 * Created by alebaffa on 2/28/16.
 */
public class Player {

    String playerName;
    java.util.Deque<Card> cards = new java.util.ArrayDeque<>();
    java.util.Deque<Card> pile = new java.util.ArrayDeque<>();

    public Player(String name) {
        this.playerName = name;
    }

    public String getPlayerName() { return playerName; }

    public boolean hasCards() {
        return cards.size() > 0;
    }

    public void addCard(Card card) {
        cards.push(card);
    }

    public void pileCard(Card card) {pile.push(card);}

    public int getTotalCards(){ return cards.size() + pile.size(); }
}
