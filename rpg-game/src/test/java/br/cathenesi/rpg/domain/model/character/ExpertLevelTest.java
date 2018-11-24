package br.cathenesi.rpg.domain.model.character;

import org.junit.Test;

import br.cathenesi.rpg.domain.model.element.character.user.Level;

import org.junit.Assert;

public class ExpertLevelTest {

	@Test
	public void testingWithFortyOnePoints() {

		Level identified = Level.identify(41);
		Assert.assertEquals(Level.EXPERT, identified);
	}

	@Test
	public void testingWithFortyFivePoints() {

		Level identified = Level.identify(45);
		Assert.assertEquals(Level.EXPERT, identified);
	}

	@Test
	public void testingWithFiftyPoints() {

		Level identified = Level.identify(50);
		Assert.assertEquals(Level.EXPERT, identified);
	}

	@Test
	public void testingWithSixtyPoints() {

		Level identified = Level.identify(60);
		Assert.assertEquals(Level.EXPERT, identified);
	}

	@Test
	public void testingWithMaxIntValuePoints() {

		Level identified = Level.identify(Integer.MAX_VALUE);
		Assert.assertEquals(Level.EXPERT, identified);
	}

}
