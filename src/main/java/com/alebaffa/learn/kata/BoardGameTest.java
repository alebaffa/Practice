package com.alebaffa.learn.kata;

import org.junit.*;

import static org.junit.Assert.*;

public class BoardGameTest{

	private static final String PLAYER_1_NAME = "player1";
	private static final String PLAYER_2_NAME = "player2";

	private Player createPlayer1() {
		Player player = new Player(PLAYER_1_NAME);
		player.addCard(new Card(2, "Heart"));
		player.addCard(new Card(2, "Heart"));
		return player;
	}

	private Player createPlayer2() {

		Player player2 = new Player(PLAYER_2_NAME);
		player2.addCard(new Card(1, "Heart"));
		player2.addCard(new Card(1, "Heart"));
		return player2;
	}

	@Test
	public void testGameNotNull() {
		assertNotEquals(null, new BoardGame(null, null));
	}

	@Test
	public void testCreatePlayerWithNoCards() {
		assertEquals(false, new Player(PLAYER_1_NAME).hasCards());
	}

	@Test
	public void testCreatePlayerWithTwoCards() {
		assertEquals(2, createPlayer1().getCards().size());
		assertEquals(true, createPlayer1().hasCards());
	}

	@Test
	public void testCompareTwoCardsAndPlayer1Wins() {
		Player player1 = createPlayer1();
		Player player2 = createPlayer2();
		BoardGame game = new BoardGame(player1, player2);

		int winner = game.compareCards(player1.getCards().pop(), player2.getCards().pop());
		assertEquals(1, winner);
	}

	@Test
	public void testGameWithTwoCardsAndPlayer1WinsWithoutWar() {
		Player player1 = new Player(PLAYER_1_NAME);
		player1.addCard(new Card(2, "Heart"));

		Player player2 =new Player(PLAYER_2_NAME);
		player2.addCard(new Card(1, "Heart"));

		BoardGame game = new BoardGame(player1, player2);
		game.playGame();

		assertEquals(PLAYER_1_NAME, game.printWinner());
	}

	@Test
	public void testGameWithWar() {
		Player player1 = new Player(PLAYER_1_NAME);
		player1.addCard(new Card(2, "Heart"));
		player1.addCard(new Card(1, "Heart"));

		Player player2 =new Player(PLAYER_2_NAME);
		player2.addCard(new Card(1, "Heart"));
		player2.addCard(new Card(1, "Heart"));

		BoardGame game = new BoardGame(player1, player2);
		game.playGame();

		assertEquals(PLAYER_1_NAME, game.printWinner());
	}
}
