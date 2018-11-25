package br.cathenesi.rpg.view;

import br.cathenesi.rpg.domain.model.Game;
import br.cathenesi.rpg.domain.model.behavior.Explorable;
import br.cathenesi.rpg.domain.model.gamemap.GameMap;
import br.cathenesi.rpg.infrastructure.GamePersistenceService;
import br.cathenesi.rpg.view.util.Terminal;

public class GameMapMenu extends BasicMenu {

	public GameMapMenu(GamePersistenceService gamePersistenceService) {
		super(gamePersistenceService);
	}
	
	public GameMap execute(Game game) throws Exception {

		GameMap gameMap = null;

		Terminal.sep();
		Terminal.esp();
		printUserInfo(game.getPlayerCharacter());
		Terminal.print("Select a map to explore:");
		Terminal.esp();
		int index = 0;
		for (Explorable avalilableMap : game.getMaps()) {
			Terminal.print("[" + ++index + "] - " + avalilableMap.getName());
		}
		super.printSaveAndExitOption();
		super.printExitOption();
		Terminal.esp();

		String mapId = Terminal.read();
		Terminal.esp();

		try {
			switch (mapId) {
			case "save": {
				super.saveGame(game);
				break;
			}
			default: {
				gameMap = game.getMaps().get(Integer.valueOf(mapId) - 1);
				break;
			}
			}
		} catch (NumberFormatException | IndexOutOfBoundsException e) {
			super.exit();
		}
		return gameMap;
	}

}
