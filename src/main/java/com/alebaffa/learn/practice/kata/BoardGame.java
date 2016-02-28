package com.alebaffa.learn.practice.kata;

import java.util.*;

public class BoardGame {

    Player player1 = new Player();
    Player player2 = new Player();

    public BoardGame(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    public List<Card> createDeck(int numCards) {
        List<Card> list = new ArrayList<>();
        for (int i = 0; i < numCards; i++) list.add(new Card(1, "test"));
        return list;
    }

    public String printWinner() {
        if(player1.cards.pop().value > player2.cards.pop().value)
            return "player1";
        else
            return "player2";
    }
}
