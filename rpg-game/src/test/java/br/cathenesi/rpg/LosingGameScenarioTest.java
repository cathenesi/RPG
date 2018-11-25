package br.cathenesi.rpg;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.cathenesi.rpg.application.MapFactory;
import br.cathenesi.rpg.domain.model.Game;
import br.cathenesi.rpg.domain.model.gamemap.GameMap;
import br.cathenesi.rpg.domain.model.gamemap.place.Cave;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LosingGameScenarioTest {

	static List<GameMap> maps;
	static GameMap selectedMap = null;
	static Game game = new Game("Player", maps);

	@BeforeClass
	public static void createMaps() throws Exception {
		maps = new MapFactory().createMaps();
	}

	@Test
	public void step1SelectingMap2() {
		selectedMap = maps.get(1);
	}

	@Test
	public void step2ExploringSecondCaveAndFightingOgreWithoutEnoughStrength() {
		Cave cave = (Cave) selectedMap.doExplore().get(1).doAction(game.getPlayerCharacter()).getNextExplorable();
		cave.getItemsToInteract().get(0).getAction().doAction(game.getPlayerCharacter());
		Assert.assertEquals(0, game.getPlayerCharacter().getStrength());				
	}

	@Test
	public void step3GameOver() {
		Assert.assertEquals(true, game.getPlayerCharacter().isKilled());				
	}

}
