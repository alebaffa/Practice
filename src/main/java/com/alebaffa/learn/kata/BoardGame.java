package com.alebaffa.learn.kata;

public class BoardGame {

	Player player1 = new Player("player1");
	Player player2 = new Player("player2");

	public BoardGame(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public String printWinner() {
		return (player1.getTotalCards() > player2.getTotalCards()) ? player1.getPlayerName() : player2.getPlayerName();
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
					while(!player2.hasCardsInPile()){
						player1.pileCard(player2.popFromPile());
					}
				}
				else{
					while(!player1.hasCardsInPile()) {
						player2.pileCard(player1.popFromPile());
						return;
					}
				}
			}
		}
	}
}
