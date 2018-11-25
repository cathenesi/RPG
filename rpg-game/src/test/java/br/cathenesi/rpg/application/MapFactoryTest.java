package br.cathenesi.rpg.application;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.cathenesi.rpg.domain.model.gamemap.GameMap;
import br.cathenesi.rpg.domain.model.gamemap.place.Cave;
import br.cathenesi.rpg.domain.model.gamemap.place.House;

public class MapFactoryTest {

	@Test
	public void buildingMaps() throws Exception {
		
		List<GameMap> maps = new MapFactory().createMaps();
		
		Assert.assertEquals(2, maps.size());
		
		Assert.assertTrue(maps.get(0).getItemsToInteract().get(0) instanceof House);
		Assert.assertEquals("Test Map 1", maps.get(0).getName());
		
		Assert.assertTrue(maps.get(1).getItemsToInteract().get(0) instanceof Cave);
		Assert.assertEquals("Test Map 2", maps.get(1).getName());
	}

}
