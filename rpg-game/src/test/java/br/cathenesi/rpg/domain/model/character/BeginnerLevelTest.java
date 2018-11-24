package br.cathenesi.rpg.domain.model.character;

import org.junit.Test;

import br.cathenesi.rpg.domain.model.element.character.user.Level;

import org.junit.Assert;

public class BeginnerLevelTest {

	@Test
	public void testingWithElevenPoints() {

		Level identified = Level.identify(11);
		Assert.assertEquals(Level.BEGINNER, identified);
	}

	@Test
	public void testingWithFifteenPoints() {

		Level identified = Level.identify(15);
		Assert.assertEquals(Level.BEGINNER, identified);
	}

	@Test
	public void testingWithTwentyPoints() {

		Level identified = Level.identify(20);
		Assert.assertEquals(Level.BEGINNER, identified);
	}

	@Test
	public void testingWithTwentyOnePoints() {

		Level identified = Level.identify(21);
		Assert.assertNotEquals(Level.BEGINNER, identified);
	}

}
