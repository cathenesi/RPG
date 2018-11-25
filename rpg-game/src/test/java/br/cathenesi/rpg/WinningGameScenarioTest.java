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
import br.cathenesi.rpg.domain.model.gamemap.place.House;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WinningGameScenarioTest {

	static List<GameMap> maps;
	static GameMap selectedMap = null;
	static Game game = new Game("Player", maps);

	@BeforeClass
	public static void createMaps() throws Exception {
		maps = new MapFactory().createMaps();
	}
	
	@Test
	public void step1SelectingMap1() {
		selectedMap = maps.get(0);
	}

	@Test
	public void step2ExploringHouseAndCollectingOnlyBread() {
		House house = (House) selectedMap.doExplore().get(0).doAction(game.getPlayerCharacter()).getNextExplorable();
		house.getItemsToInteract().get(0).getAction().doAction(game.getPlayerCharacter());
		Assert.assertEquals(20, game.getPlayerCharacter().getStrength());
	}

	@Test
	public void step3ExploringFirstCaveAndCollectingSword() {
		Cave cave = (Cave) selectedMap.doExplore().get(1).doAction(game.getPlayerCharacter()).getNextExplorable();
		cave.getItemsToInteract().get(0).getAction().doAction(game.getPlayerCharacter());
		Assert.assertEquals(320, game.getPlayerCharacter().getStrength());		
	}

	@Test
	public void step4ExploringSecondCaveAndFightingDragon() {
		Cave cave = (Cave) selectedMap.doExplore().get(2).doAction(game.getPlayerCharacter()).getNextExplorable();
		cave.getItemsToInteract().get(0).getAction().doAction(game.getPlayerCharacter());
		Assert.assertEquals(220, game.getPlayerCharacter().getStrength());				
	}

	@Test
	public void step5UserIsAlive() {
		Assert.assertEquals(false, game.getPlayerCharacter().isKilled());				
	}
	

}
