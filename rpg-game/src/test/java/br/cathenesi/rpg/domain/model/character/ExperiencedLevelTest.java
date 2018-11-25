package br.cathenesi.rpg.domain.model.character;

import org.junit.Test;

import br.cathenesi.rpg.domain.model.gameitem.player.Level;

import org.junit.Assert;

public class ExperiencedLevelTest {

	@Test
	public void testingWithThirtyOnePoints() {

		Level identified = Level.identify(31);
		Assert.assertEquals(Level.EXPERIENCED, identified);
	}

	@Test
	public void testingWithThirtyFivePoints() {

		Level identified = Level.identify(35);
		Assert.assertEquals(Level.EXPERIENCED, identified);
	}

	@Test
	public void testingWithFortyPoints() {

		Level identified = Level.identify(40);
		Assert.assertEquals(Level.EXPERIENCED, identified);
	}

	@Test
	public void testingWithFortyOnePoints() {

		Level identified = Level.identify(41);
		Assert.assertNotEquals(Level.EXPERIENCED, identified);
	}

}
