package com.alebaffa.learn.kata;

import java.util.*;

public class BoardGame {

    Player player1 = new Player("player1");
    Player player2 = new Player("player2");

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
        int player1TotCards = player1.cards.size() + player1.pile.size();
        int player2TotCards = player2.cards.size() + player2.pile.size();
        return (player1TotCards > player2TotCards) ? player1.getPlayerName() : player2.getPlayerName();
    }

    public void playRound() {
        Card topCardPlayer1 = player1.cards.pop();
        Card topCardPlayer2 = player2.cards.pop();

        if(topCardPlayer1.value > topCardPlayer2.value){
            player1.pileCard(topCardPlayer2);
        } else
            player2.pileCard(topCardPlayer1);
    }
}
