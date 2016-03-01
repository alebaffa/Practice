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
	List<Card> deck = new ArrayList<>();
	for (int i = 0; i < numCards; i++) deck.add(new Card(1, "test"));
	return deck;
}

public String printWinner() {
	return (player1.getTotalCards() > player2.getTotalCards()) ? player1.getPlayerName() : player2.getPlayerName();
}

public void playRound() {
	while(player1.hasCards() && player2.hasCards()){

		player1.pileCard(player1.getCards().pop());
		player2.pileCard(player2.getCards().pop());

		if(isWar(player1.getPile().getFirst(), player2.getPile().getFirst())){
			playRound();
		}

		if(player1.getPile().getFirst().value > player2.getPile().getFirst().value){
			while(player2.getPile().size() != 0)
				player1.pileCard(player2.getPile().pop());
		} else {
			while(player1.getPile().size() != 0)
				player2.pileCard(player1.getPile().pop());
		}
	}
	if(player1.getPile().size() == 0 || player2.getPile().size() == 0)
		return;
}

private boolean isWar(Card topCardPlayer1, Card topCardPlayer2) {
	return topCardPlayer1.value == topCardPlayer2.value;
}
}
