package com.alebaffa.learn.kata;

public class BoardGame {

	Player player1 = new Player("player1");
	Player player2 = new Player("player2");

	public BoardGame(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public String printWinner() {
		if(player1.getTotalCards() == 0 && player2.getTotalCards() == 0)
			return null;
		else
			return (player1.getTotalCards() > player2.getTotalCards()) ? player1.getPlayerName() : player2
					.getPlayerName();
	}

	public int compareCards(Card player1card, Card player2card) {
		return player1card.compareTo(player2card);
	}

	public void playGame(){
		while(player1.getTotalCards() != 0 && player2.getTotalCards() != 0){

			Card player1card = player1.popFromCards();
			Card player2card = player2.popFromCards();
			player1.pileCard(player1card);
			player2.pileCard(player2card);

			int isWar = compareCards(player1card, player2card);
			if(isWar == 0)
				playGame();
			else {
				if(isWar == 1){
					player1WinsCardPlayer2();
				}
				else{
					player2WinsCardsPlayer1();
				}
			}
		}
	}

	private void player2WinsCardsPlayer1() {
		while(player1.hasCardsInPile()) {
			player2.pileCard(player1.popFromPile());
			return;
		}
	}

	private void player1WinsCardPlayer2() {
		while(player2.hasCardsInPile()){
			player1.pileCard(player2.popFromPile());
		}
	}

	public void createDeck(int numOfCards) {
		for(int i = 0; i < 52; i++) {
			//TODO here I have to create a set of 52 cards and randomly assign 25 to each player.
			// here comes the concept of seed in Card.
		}
	}
}
