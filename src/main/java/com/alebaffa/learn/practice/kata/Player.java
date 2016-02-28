package com.alebaffa.learn.practice.kata;

/**
 * Created by alebaffa on 2/28/16.
 */
public class Player {

    java.util.Deque<Card> cards = new java.util.ArrayDeque<>();

    public boolean hasCards() {
        return cards.size() > 0;
    }

    public void addCard(Card card) {
        cards.push(card);
    }

    public int getNumCards() {
        return cards.size();
    }
}
