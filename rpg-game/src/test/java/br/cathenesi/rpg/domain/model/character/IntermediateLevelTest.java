package br.cathenesi.rpg.domain.model.character;

import org.junit.Test;

import br.cathenesi.rpg.domain.model.gameitem.player.Level;

import org.junit.Assert;

public class IntermediateLevelTest {

	@Test
	public void testingWithTwentyOnePoints() {

		Level identified = Level.identify(21);
		Assert.assertEquals(Level.INTERMEDIATE, identified);
	}

	@Test
	public void testingWithTwentyFivePoints() {

		Level identified = Level.identify(25);
		Assert.assertEquals(Level.INTERMEDIATE, identified);
	}

	@Test
	public void testingWithThirtyPoints() {

		Level identified = Level.identify(30);
		Assert.assertEquals(Level.INTERMEDIATE, identified);
	}

	@Test
	public void testingWithThirtyOnePoints() {

		Level identified = Level.identify(31);
		Assert.assertNotEquals(Level.INTERMEDIATE, identified);
	}

}
