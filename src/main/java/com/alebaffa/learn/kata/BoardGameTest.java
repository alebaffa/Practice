package com.alebaffa.learn.kata;

import static org.junit.Assert.*;

public class BoardGameTest{

    @org.junit.Test
    public void testGameNotNull() {
        assertNotEquals(null, new BoardGame(null, null));
    }

    @org.junit.Test
    public void testCreateDeckWithOneCard() {
        BoardGame game = new BoardGame(null, null);
        assertEquals(1, game.createDeck(1).size());
    }

    @org.junit.Test
    public void testCreateDeckWith52Cards() {
        BoardGame game = new BoardGame(null, null);
        assertEquals(52, game.createDeck(52).size());
    }

    @org.junit.Test
    public void testCreatePlayerWithNoCards() {
        Player player = new Player();
        assertEquals(false, player.hasCards());
    }

    @org.junit.Test
    public void testCreatePlayerWithTwoCards() {
        Player player = new Player();
        player.addCard(new Card(1, "Heart"));
        player.addCard(new Card(2, "Heart"));
        assertEquals(2, player.getNumCards());
        assertEquals(true, player.hasCards());
    }

    @org.junit.Test
    public void testPlayer1Wins() {
        Player player1 = new Player();
        player1.addCard(new Card(2, "Heart"));
        Player player2 = new Player();
        player2.addCard(new Card(1, "Heart"));
        BoardGame game = new BoardGame(player1, player2);

        assertEquals("player1", game.printWinner());
    }

}
