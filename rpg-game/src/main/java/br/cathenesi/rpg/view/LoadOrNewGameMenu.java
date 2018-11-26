package br.cathenesi.rpg.view;

import java.io.IOException;

import br.cathenesi.rpg.domain.model.Game;
import br.cathenesi.rpg.infrastructure.GameInstantiationService;
import br.cathenesi.rpg.infrastructure.GamePersistenceService;
import br.cathenesi.rpg.view.util.Terminal;

public class LoadOrNewGameMenu extends BasicMenu {

	private GameInstantiationService gameInstantiationService;

	public LoadOrNewGameMenu(GameInstantiationService gameInstantiationService,
			GamePersistenceService gamePersistenceService) {
		super(gamePersistenceService);
		this.gameInstantiationService = gameInstantiationService;
	}

	public Game execute() throws Exception {

		Game result = null;

		Terminal.sep();
		Terminal.esp();
		Terminal.print("Hello, Welcome!");
		Terminal.esp();
		Terminal.print("Would you like to:");
		Terminal.esp();
		Terminal.print("[1] - Start a new game");
		Terminal.print("[2] - Load a previous saved game");
		super.printExitOption();
		Terminal.esp();
		String input = Terminal.read();

		switch (input) {
		case "1":
			result = this.newGame();
			break;
		case "2":
			result = this.loadGame();
			break;
		default:
			super.exit();
			break;
		}
		return result;
	}

	private Game newGame() throws Exception {
		Terminal.sep();
		Terminal.esp();
		Terminal.print("Starting new game");
		Terminal.esp();
		Terminal.print("Type the name of your Character: ");
		Terminal.esp();
		String playerCharacterName = Terminal.read();
		Terminal.esp();
		Game game = this.gameInstantiationService.newGame(playerCharacterName);
		Terminal.print("Character created, enjoy the game, " + playerCharacterName + "!");
		Terminal.esp();
		Terminal.print("Collect items to increase strength, and fight for increase experience");
		Terminal.esp();
		return game;
	}

	private Game loadGame() throws Exception {

		Game result = null;
		try {
			Terminal.print("Loading previous game...");
			result = super.gamePersistenceService.load();
		} catch (IOException e) {
			Terminal.attention("Could'nt find any saved game");
		}
		return result;
	}

}
