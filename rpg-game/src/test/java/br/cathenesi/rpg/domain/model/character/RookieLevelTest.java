package br.cathenesi.rpg.domain.model.character;

import org.junit.Test;

import br.cathenesi.rpg.domain.model.gameitem.player.Level;

import org.junit.Assert;

public class RookieLevelTest {

	@Test
	public void testingWithZeroPoints() {

		Level identified = Level.identify(0);
		Assert.assertEquals(Level.ROOKIE, identified);
	}

	@Test
	public void testingWithFivePoints() {

		Level identified = Level.identify(5);
		Assert.assertEquals(Level.ROOKIE, identified);
	}

	@Test
	public void testingWithTenPoints() {

		Level identified = Level.identify(10);
		Assert.assertEquals(Level.ROOKIE, identified);
	}

	@Test
	public void testingWithElevenPoints() {

		Level identified = Level.identify(11);
		Assert.assertNotEquals(Level.ROOKIE, identified);
	}

}
