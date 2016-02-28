package com.alebaffa.learn.kata;

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

    @org.junit.Test
    public void testGameNotNull() {
        assertNotEquals(null, new BoardGame(null, null));
    }

    @org.junit.Test
    public void testCreateDeckWithOneCard() {
        assertEquals(1, new BoardGame(null, null).createDeck(1).size());
    }

    @org.junit.Test
    public void testCreateDeckWith52Cards() {
        assertEquals(52, new BoardGame(null, null).createDeck(52).size());
    }

    @org.junit.Test
    public void testCreatePlayerWithNoCards() {
        assertEquals(false, new Player(PLAYER_1_NAME).hasCards());
    }

    @org.junit.Test
    public void testCreatePlayerWithTwoCards() {
        assertEquals(2, createPlayer1().cards.size());
        assertEquals(true, createPlayer1().hasCards());
    }

    @org.junit.Test
    public void testPlayer1WinsWithRoundNoWar() {
        BoardGame game = new BoardGame(createPlayer1(), createPlayer2());
        game.playRound();
        assertEquals(PLAYER_1_NAME, game.printWinner());
    }
}
