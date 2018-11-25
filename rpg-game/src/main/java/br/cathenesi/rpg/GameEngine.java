package br.cathenesi.rpg;

import br.cathenesi.rpg.domain.model.Game;
import br.cathenesi.rpg.domain.model.action.ActionResult;
import br.cathenesi.rpg.domain.model.gameitem.player.PlayerCharacter;
import br.cathenesi.rpg.domain.model.gamemap.GameMap;
import br.cathenesi.rpg.infrastructure.impl.DefaultGameInstantiationService;
import br.cathenesi.rpg.infrastructure.impl.DiskGamePersistenceService;
import br.cathenesi.rpg.view.ExploreMenu;
import br.cathenesi.rpg.view.GameMapMenu;
import br.cathenesi.rpg.view.LoadOrNewGameMenu;

public class GameEngine {

	DiskGamePersistenceService gamePersistenceService = new DiskGamePersistenceService();
	LoadOrNewGameMenu loadOrNewGameMenu = new LoadOrNewGameMenu(new DefaultGameInstantiationService(),
			gamePersistenceService);
	GameMapMenu gameMapMenu = new GameMapMenu(gamePersistenceService);
	ExploreMenu exploreMenu = new ExploreMenu(gamePersistenceService);

	public void play() throws Exception {

		Game game = null;

		while (game == null) {
			game = this.loadOrNewGameMenu.execute();
		}

		PlayerCharacter player = game.getPlayerCharacter();

		while (true) {
			GameMap gameMap = this.gameMapMenu.execute(game);
			ActionResult actionResult = this.exploreMenu.execute(game, gameMap);
			if (actionResult != null && actionResult.getNextExplorable() != null) {
				this.exploreMenu.execute(game, actionResult.getNextExplorable());
			}
			if (player.isKilled()) {
				this.loadOrNewGameMenu.exit();
			}
		}

	}

}
